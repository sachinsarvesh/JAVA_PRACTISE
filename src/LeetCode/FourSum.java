package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FourSum {
    public static void main(String[] args){
        int nums[] ={1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        System.out.println(fourSumBasic(nums,target));
        System.out.println(fourSum(nums,target));
    }

    private static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        if (n < 4) return new ArrayList<>();

        Arrays.sort(nums);
        if((long)nums[0] + nums[1] + nums[2] + nums[3] > target) return new ArrayList<>();
        if(((long)nums[n-1] + nums[n-2] + nums[n-3] + nums[n-4]) < target) return new ArrayList<>();

        List<List<Integer>> result = new LinkedList<>();
        for(int i =0; i<n-3;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

            for(int j=i+1; j<n-2;j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;

                int left = j+1;
                int right = n-1;

                while(left < right){
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum ==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right] ));
                        while(left < right && nums[left] == nums[left+1]) left++;
                        while(left < right && nums[right] == nums[right - 1]) right--;
                        right --;
                        left ++;
                    }else if(sum < target) left++;
                    else right --;
                }
            }
        }
        return result;
    }

    private static List<List<Integer>> fourSumBasic(int[] nums, int target) {
        List<List<Integer>> result = new LinkedList<>();

        System.out.println("Before sorting : " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("After sorting : " + Arrays.toString(nums));
        int size = nums.length;
        //if(size < 4) return result;
        for(int i =0; i < size-3;i++ ){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j= i+1; j<size-2; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                //int int_sum = target - nums[i] - nums[j];
                long sum = (long)target - nums[i] - nums[j];
               //System.out.println("int sum : " + int_sum);
                System.out.println("long sum : " + sum);
                int left = j + 1;
                int right = size-1;

                while(left < right){
                    //System.out.println(nums[left] + nums[right] + " , " + sum);
                    long twoSum = (long)nums[left] + nums[right];
                    if(twoSum > sum) right--;
                    else if(nums[left] + nums[right] < sum) left++;
                    else{
                        result.add(Arrays.asList(nums[i], nums[j],nums[left++],nums[right--]));
                        while(left < right && nums[left]==nums[left-1])left++;
                        while(left < right && nums[right]==nums[right+1])right--;
                    }
                }
            }
        }
        return result;
    }
}
