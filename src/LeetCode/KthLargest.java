package LeetCode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4} ;
        int k =2;

//        System.out.println("Min Heap Method : " + kthLargetMH(nums,k));
//        System.out.println("Quick select Method : " + kthLargetQS(nums,k));
        System.out.println("Frequency sorting Method : " + findKthLargest(nums,k) );
    }

    private static int kthLargetQS(int[] nums,int k) {
        int n = nums.length;
        return quickSelect(nums, 0, n-1, n-k);
    }

    private static int quickSelect(int[] nums, int low, int high, int k) {
        int pivotIndex = partition(nums,low,high);

        if(pivotIndex == k) return nums[pivotIndex];
        else if(pivotIndex < k) return quickSelect(nums, pivotIndex + 1, high, k);
        else return quickSelect(nums, low, pivotIndex - 1, k);

    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low;

        for(int j=low;j<high;j++){
            if(nums[j] <= pivot){
                swap(nums,i,j);
                i++;
            }
        }
        swap(nums,i,high);
        return i;
    }

    private static void swap(int[] nums, int i, int j) {
        int  temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    // Min heap method
    private static int kthLargetMH(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0; i <nums.length;i++){
            pq.offer(nums[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }

    private static int findKthLargest(int[] nums, int k) {
        int min = nums[0], max = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int x = nums[i];
            if (x < min) min = x;
            else if (x > max) max = x;
        }
        System.out.println("min : " + min + " max : " + max);

        int[] count = new int[max - min + 1];
        for (int i = 0; i < n; i++) {
            count[nums[i] - min]++;
        }
        System.out.println(Arrays.toString(count));

        for (int i = count.length - 1; i >= 0; i--) {
            System.out.println("k : " + k + ", i : " + i + ", count[i] : " + count[i] );
            k -= count[i];
            if (k <= 0) return i + min;
        }
        return -1;
    }
}
