package BasicPrograms;

/*
**** Problem Statement ****
You are given a number  and you have to print your answer according to the following:

If the number is divisible by 3, you print "Fizz" (without quotes)
If the number is divisible by 5, you print "Buzz" (without quotes)
If the number is divisible by both 3 and 5, you print "FizzBuzz" (without quotes)
In any other case, you print the number itself

Note: You should add a newline character after print() statement.

Examples:

Input: number = 3
Output: Fizz
Explanation: Here, the number is divisible by 3, so Fizz is printed.
Input: number = 5
Output: Buzz
Explanation: Here the number is divisible by 5, so Buzz is printed.
Input: number = 15
Output: FizzBuzz
Explanation: Here, the number 15 is divisible by both 3 and 5, so FizzBuzz is printed.


**** Learnings ****
1) Relational operators
 */

import java.util.Scanner;

public class FizzBuzzProgram {

    // Code for FizzBuzzProgram comparator
    public static void fizzBuzz(int number) {
        if(number%3==0 && number%5==0){
            System.out.println("FizzBuzz");
        }else if(number%3==0){
            System.out.println("Fizz");
        }else if(number%5==0){
            System.out.println("Buzz");
        }else
            System.out.println(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        fizzBuzz(num);

    }
}
