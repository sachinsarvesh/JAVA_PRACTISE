package BasicPrograms;

import java.util.Scanner;

public class ArrayFromUserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the count of int in array");
        int count = scanner.nextInt();
        int[] arr = new int[count];
        System.out.println("Enter " + count + " integers:");
        for (int i =0; i < count; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("The final array is....");
        for(int ar : arr){
            System.out.println(ar);
        }
    }
}
