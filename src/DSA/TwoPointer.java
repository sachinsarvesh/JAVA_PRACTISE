package DSA;

import java.util.Arrays;

/*
Two pointer pattern
We use this method when we need to traverse in an array.
We use two pointers, one from left and another from right.
We increment the left or decrement the right based on the condition.

Used in String reversal, String palindrome and sorted array problems

 */
public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int target = 6;
        System.out.println(Arrays.toString(targettedOutput(arr, target)));
    }

    private static int[] targettedOutput(int[] arr, int target) {
        ;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if ((arr[left] + arr[right]) > target) right--;
            else if ((arr[left] + arr[right]) < target) left++;
            else return new int[]{arr[left], arr[right]};
        }
        return new int[] {};
    }
}
