package LeetCode;

public class FindDuplicate {
    public static void main(String[] Args) {
        int[] nums = {3,1,3,4,2};
        //System.out.println(findDuplicates(nums));
        System.out.println(findDuplicatesOptimised(nums));
    }

    private static int findDuplicatesOptimised(int[] nums) {
        int n = nums.length;
        boolean arr[] = new boolean[n+1];
        for(int i=0; i<n;i++){
            System.out.printf("i - %d, Nums[i] - %d",i, nums[i] );
            System.out.println();
            if(arr[nums[i]]) return nums[i];
            arr[nums[i]] = true;
            System.out.printf("arr[nums[i]] - %b",arr[nums[i]]);
            System.out.println();
        }
        return -1;
    }

    private static int findDuplicates(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
            System.out.printf("Slow : %d, Fast : %d",slow,fast);
            System.out.println();
        }while (slow != fast);

        slow = nums[0];
        System.out.println("Starting second while loop");
        while(slow !=fast){

            slow = nums[slow];
            fast = nums[fast];
            System.out.printf("Slow : %d, Fast : %d",slow,fast);
            System.out.println();
        }
        return slow;
    }

}