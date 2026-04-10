package LeetCode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k = removeElement(nums,val);
        System.out.println(k);
    }

    private static int removeElement(int[] nums, int val) {
        int x = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]!=val){
                nums[x]=nums[i];
                x++;
            }
        }
        return x;
    }
}
