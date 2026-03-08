package BasicPrograms;
/*
program to swap two numbers with different methods
1) Third variable method
2) Sum and difference
3) Bitwise operator
4) Array methods
 */

public class SwapTwoNumber {

    public static void main(String[] args){

        int num1 = 5;
        int num2 = 10;

    //Method 1
        System.out.println("Method 1 : \nThird variable swap");
        System.out.println("Values before swap num1 = " + num1 + " num2 = " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Values after swap num1 = " + num1 + " num2 = " + num2);

    //Method 2
        System.out.println("\nMethod 2 : \nSum and Difference");
        System.out.println("Values before swap num1 = " + num1 + " num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Values after swap num1 = " + num1 + " num2 = " + num2);

    //Method 3
        System.out.println("\nMethod 3 : \nBitwise XOR operator");
        System.out.println("Values before swap num1 = " + num1 + " num2 = " + num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("Values after swap num1 = " + num1 + " num2 = " + num2);

    //Method 4
        System.out.println("\nMethod 4 : \nArray Swap method");
        int[] nums = {num1,num2};
        System.out.println("Values before swap num1 = " + nums[0] + " num2 = " + nums[1]);
        swapWithArray(nums);

        System.out.println("Values after swap num1 = " + nums[0] + " num2 = " + nums[1]);

    }
    public static void swapWithArray(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
