package LeetCode;

public class ContainerWithMostWater {
    public static void main(String[] args){
        int[] containers = {1,8,6,2,5,4,8,3,7};
        mostWater(containers);
    }

    private static void mostWater(int[] containers) {
        int i =0, j = containers.length-1;
        int capacity = 0;
        int max_capacity = 0;
        while(i<j){
            if(containers[i] > containers[j] ){
                capacity = containers[j] * (j-i);
                j--;
            }else{
                capacity = containers[i] * (j-i);
                i++;
            }
            if(capacity > max_capacity){
                max_capacity = capacity;
            }
        }
        System.out.println(max_capacity);
    }
}
