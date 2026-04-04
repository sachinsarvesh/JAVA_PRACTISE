package BasicPrograms;
/*
**** Problem Statement ****
We will be given two inputs.
a) Array of integer
b) Target Number

We need to return an array of indexes,
where sum of two numbers from the given array equals the target

**** Learnings ****
1) For loop
2) Comparator with Hashmap
 */

import java.util.Arrays;
import java.util.HashMap;

public class SumOfArrayAndTarget {

    public static void main(String[] args){

        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumAndTarget(nums, target)));
    }

    private static int[] twoSumAndTarget(int[] nums, int target) {
        // Optimised Solution
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int itr1 = 0; itr1 < nums.length; itr1++){
            int complement = target - nums[itr1];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),itr1};
            }
            map.put(nums[itr1],itr1);
        }
        return new int[]{};
    }

    public static int[] twoSumAndTarget_brute(int[] nums, int target) {

        //  ****  Normal solution ****
        int arr_length = nums.length;
        for (int itr1 = 0; itr1 < arr_length; itr1++) {
            for (int itr2 = itr1 + 1; itr2 < arr_length; itr2++) {
                int sum_of_two_itrs = nums[itr1] + nums[itr2];
                if (sum_of_two_itrs == target) {
                    System.out.println("Found the indexes " + itr1 + " , " + itr2);
                    return new int[]{itr1, itr2};
                }
            }
        }
        return new int[] {};
    }
}
