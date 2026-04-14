package LeetCode;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Stack;

public class WarmerTemperature {

    public static void main(String[] args){
        int[] temps = {73,74,75,71,69,72,76,73};
        findWarmerTemp(temps);
    }

    private static void findWarmerTemp(int[] temps) {
        int n = temps.length - 1;
        int[] wd = new int[n+1];
        Stack<Integer> stack = new Stack<>();

        for(int i = n; i>=0; i--){
            int itr = 1;

            System.out.println("i : " + i + ", , itr : " + itr + ", temps[i] :  " + temps[i] );

            if( !stack.isEmpty()) System.out.println("stack.peek : " + stack.peek());
            while(!stack.isEmpty() && temps[stack.peek()] <= temps[i]){

                stack.pop();
                itr++;
            }
            System.out.println("Stack before push" + stack);
            wd[i] = stack.isEmpty()?0:stack.peek()-i;
            stack.push(i);
            System.out.println("Stack after push" + stack );
            System.out.println();
        }

        System.out.println(Arrays.toString(wd));

    }

}

// 73, 74, 75, 71, 69, 72, 76, 73
// 73, 74, 75, 71, 69, 72, 0, 0

// [1,1,4,2,1,1,0,0]