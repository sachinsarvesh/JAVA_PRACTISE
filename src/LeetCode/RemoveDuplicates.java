package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums = {0,1,2,3,4};

       //int k = removeDuplicates(nums);
        int k = removeDuplicatesOptimised(nums);
        System.out.println(k);
    }

    private static int removeDuplicatesOptimised(int[] nums) {
        int x = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]>nums[x]){
                nums[++x] = nums[i];
            }
        }

        return x+1;
    }


    private static int removeDuplicates(int[] nums) {
        Map<Integer,Integer>map = new HashMap<>();
        int j =0;
        for(int i =0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
                nums[j++] = nums[i];
            }
        }
//        System.out.println("Map : " + map);
//        System.out.println("Array : " + Arrays.toString(nums));
        return j;
    }


}
