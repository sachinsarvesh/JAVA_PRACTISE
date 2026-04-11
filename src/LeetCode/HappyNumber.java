package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args){
        System.out.println(isHappy(2));
    }

    private static boolean happynumber(int n) {
        Set<Integer> visited = new HashSet<>();

        while(!visited.contains(n)){
            visited.add(n);
            n = getNextNumber(n);
            System.out.println(" retuened no " + n);
            if(n==1) return true;
        }

        return false;
    }

    private static int getNextNumber(int n) {
        int output =0;
        while(n > 0){
            int digit = n % 10;
            System.out.println(" digit " + digit);
            output += digit * digit;
            System.out.println(" output " + output);
            n = n/10;
            System.out.println(" n " + n);
            System.out.println("End of get next number while loop");
        }
        return output;
    }

    public static boolean isHappy(int n) {
        while(n!=1 && n!=4){
            int sum = 0;
            while(n > 0){
                int d = n%10;
                sum+=d*d;
                n = n/10;
            }
            n = sum;
        }
        if(n==1){
            return true;
        }
        else return false;
    }
}
