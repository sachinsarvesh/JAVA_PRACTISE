package BasicPrograms;

public class SumOfAnArray {
    public static void main(String[] args){
        int[] numbers = {5,10,15,20,25};
        int sum = 0;

//        for(int i =0; i < numbers.length; i++){
//            sum += numbers[i];
//        }
        for(int num : numbers){
            sum += num;
        }

        System.out.println("Sum of array is " + sum);
    }
}
