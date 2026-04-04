package DSA;

/*
Prefix Sum Data pattern
When you are given an array and the scenario is as follows.
1) Multiple queries to find the sum of a sub array
2) Sum of elements between two indexes
*/


import java.util.Arrays;

public class Prefix_Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        prefixSum(arr);
    }

    public static void prefixSum(int[] arr) {

        int itr = 0;
        int sum = 0;
        int size = arr.length;
        int[] prefixed_sum_arr = new int[size];

        while(itr < size){
            sum += arr[itr];
            prefixed_sum_arr[itr++] = sum;
        }
        System.out.println("Actual array : " + Arrays.toString(arr));
        System.out.println("Array after sum operation : " +Arrays.toString(prefixed_sum_arr));

        // Example to print sum between 2nd and 6th index;
        int start = 2;
        int end = 6;
        int sumBetween2and6 = prefixed_sum_arr[6] - prefixed_sum_arr[2-1];
        System.out.println(sumBetween2and6);
    }
}
