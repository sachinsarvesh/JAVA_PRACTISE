package LeetCode;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
//        threeSumBruteForce(nums);
        System.out.println(threeSum(nums));

    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int size = nums.length;
        if (size < 3) return res;

        Arrays.sort(nums);

        for(int i=0; i < size-2; i++ ){
            if(i>0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;

            int left = i + 1;
            int right = size - 1;
            int target = - nums[i];

            while(left < right){
                int sum = nums[left] + nums[right];
                if (sum == target){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    right --;
                    left ++;

                    while (left < right && nums[left] == nums[left-1]) left++;
                    while (left < right && nums[right] == nums[right+1]) right--;
                }else if(sum>target){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return res;
    }

    private static void threeSumBruteForce(int[] nums) {
        int sum = 0;
        Set<List<Integer>> unique_triplets = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1; j< nums.length ; j++){
                for(int k = j+1; k <nums.length;k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        //unique_triplets.add(Arrays.asList(nums[i] , nums[j] , nums[k]));
                        int[] triplets = {nums[i] , nums[j] , nums[k]};
                        Arrays.sort(triplets);
                        unique_triplets.add(Arrays.asList(triplets[0],triplets[1],triplets[2]));
//                        System.out.println("Sum of " + nums[i] + " , " + nums[j] + " , " + nums[k] + " is " + sum);
                    }
                }
            }
        }
        System.out.println(unique_triplets);
    }
}
