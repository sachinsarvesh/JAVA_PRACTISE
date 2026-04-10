package TestInterview;

import java.util.Stack;

public class NextGreaterElement {
    //Input: arr = [16, 17, 4, 3, 5, 2,10]
    //Output: [17, -1, 5, 5,10, 10, -1]

    public static void main(String[] args) {
// 1)  Greater first element to the right
        int[] arr = {16, 17, 4, 3, 5, 2, 10};
        int[] result = findNextGreater(arr);
        for(int a =0 ; a < arr.length ; a++) {
            System.out.println(result[a]);
        }
    }

    private static int[] findNextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();
        //System.out.println(stack.isEmpty());
        for(int i = n-1 ; i >=0; i-- ){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            result[i] = stack.isEmpty()? -1 : stack.peek();
            stack.push(arr[i]);

        }
        return result;
    }
}





