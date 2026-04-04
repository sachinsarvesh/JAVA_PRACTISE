package TestInterview;

import java.util.Stack;

public class test1 {
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

//        int size = arr.length;
//        int larger = 0;
//
//        for (int i = 0, j = i+1; i <= size -1; j++){
//            larger=0;
//            if(arr[j] > arr[i]){
//                larger = arr[j];
//                i++;
//                break;
//            }
//            if(larger == 0){
//                System.out.println(-1);
//            } else{
//                System.out.println(larger);
//            }

        // 2) water container
//        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        for (int i =0; i < arr.length -1; i++){
//            int build_1 = arr[i];
//            int build_2 = arr[i+1];
//            int dist = i  ;
//            int cap = 0;
//            System.out.println(build_1 + " " + build_2 + " " + dist);
//            if(build_1 < build_2){
//                cap = build_1 * dist;
//            }else{
//                cap = build_1 * dist;
//            }
//            System.out.println(cap);
//



