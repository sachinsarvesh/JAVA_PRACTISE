package LeetCode;

import java.util.Arrays;

public class MedianOfTwoSortedArray {

    public static void main(String[] args){

        int[] num1 = {1,2};
        int[] num2 = {3,4};
        System.out.println(findMedianTimeOptimised(num1,num2));
        // findMedianSortedArrays(num1,num2);
        // findMedianSpaceOptimised(num1,num2);

    }

    public static double findMedianTimeOptimised(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) return findMedianTimeOptimised(nums2, nums1);

         int m = nums1.length;
         int n = nums2.length;
         int low = 0;
         int high = m;

         while(low <= high){
             int i = (low + high ) / 2;
             int j = (m + n + 1)/2 - i;

             int maxLeft1 = (i==0) ? Integer.MIN_VALUE :nums1[i-1];
             int minRight1 = (i==m) ? Integer.MAX_VALUE : nums1[i];

             int maxLeft2 = (j==0) ? Integer.MIN_VALUE : nums2[j-1];
             int minRight2 = (j ==n) ? Integer.MAX_VALUE : nums2[j];

             if ((maxLeft1 <= minRight2) && (maxLeft2 <= minRight1)){
                 // System.out.println("inside main if");
                 if((m+n) % 2 ==0){
                     return (Math.max(maxLeft2,maxLeft1) + Math.min(minRight2,minRight1))/2.0;
                 } else {
                     return Math.max(maxLeft2,maxLeft1);
                 }
             }else if(maxLeft1 > minRight2){
                 // System.out.println("inside else if");
                 high = i -1;
             } else {
                 // System.out.println("inside else");
                 low = i+1;
             }
         }
        return 0.0;
    }
    private static void findMedianSpaceOptimised(int[] num1, int[] num2) {
        int num1_size = num1.length;
        int num2_size = num2.length;
        int total_length = num1_size + num2_size;

        int i =0, j=0, current =0, previous = 0;

        for(int k=0; k<=total_length/2;k++) {
            previous = current;
            if (i < num1_size && (j >= num2_size || num1[i] < num2[j])) {
                current = num1[i++];
            } else {
                current = num2[j++];
            }
        }
        //  System.out.println(previous + " ' " + current + "length : " + total_length/2);
        if(total_length % 2 != 0){
            System.out.println("inside first" + current);
        }else{
            System.out.println((previous + current) / 2.0);
        }

    }


    public static void findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1_size = nums1.length;
        int num2_size = nums2.length;
        int total_length = num1_size + num2_size;
        // System.out.printf("%d %d ",num1_size, num2_size);

        int[] nums3 = new int[num1_size + num2_size];

        int i=0, j=0, k=0;

        while(i < num1_size && j < num2_size ){
            nums3[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }

        while (i < num1_size) nums3[k++] = nums1[i++];
        while (j < num2_size) nums3[k++] = nums2[j++];

        // System.out.println(Arrays.toString(nums3));

        if(total_length%2 !=0){
            System.out.println(nums3[total_length/2]);
        }else{
            System.out.println((nums3[total_length/2 -1] + nums3[total_length/2] )/2.0);
        }
    }
}
