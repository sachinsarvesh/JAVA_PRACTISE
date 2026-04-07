package LeetCode;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args){
        int[] num = {-1,2,1,4};
        int target = 2;

        System.out.println(threeSumCloset(num,target));
    }

    private static int threeSumCloset(int[] num, int target) {
        Arrays.sort(num);
        int n = num.length;
        int result = num[0] + num[1] + num[2];

        for(int i =0; i < n-2; i++){
            int left = i+1;
            int right = n-1;

            while(left < right){
                int sum = num[i] + num[left] + num[right];

                if(Math.abs(target-sum) < Math.abs(target-result)){
                    result =sum;
                }
                if (sum==target) return target;
                else if (sum< target) left ++;
                else right --;
            }
        }

        return result;
    }
}
