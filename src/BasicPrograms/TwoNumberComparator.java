package BasicPrograms;

/*
**** Problem Statement ****
Given two integers, n and m. The task is to check the relation between n and m.
Return "lesser" if n < m,  "equal" if n == m, and "greater" if n > m.

Examples :

Input: n = 4, m = 8
Output: lesser
Explanation: 4 < 8 so print 'lesser'.

Input: n = 8, m = 8
Output: equal
Explanation: 8 = 8 so print 'equal'.

Input: n = 8, m = 4
Output: greater
Explanation: 8 > 4 so print 'greater'.


**** Learnings ****
1) To get input from the user
2) Use methods and return the value
3) Print the returned value as a result
 */

import java.util.Scanner;
public class TwoNumberComparator {

    // Code for comparator
    public static String numComparator(int int1, int int2){
        if (int1 < int2) {
            return "lesser";
        } else if (int1 == int2) {
            return "equal";
        } else
            return "greater";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        String result = numComparator(num1,num2);

        System.out.println("The selected numbers are " + num1 + " and " + num2 + " and the result is " + result);
    }
}
