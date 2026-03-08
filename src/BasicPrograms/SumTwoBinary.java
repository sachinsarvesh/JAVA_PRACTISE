package BasicPrograms;

public class SumTwoBinary {

     public static String addViaParse(String x, String y){
        int num1 = Integer.parseInt(x,2);
        int num2 = Integer.parseInt(y,2);

        int sum = num1 + num2;
        System.out.println("Sum of "+ num1 + " and " + num2 + " is " + sum);
        return Integer.toBinaryString(sum);
    }

    public static String addViaAddition(String x, String y){
         int i = x.length()-1;
         int j = y.length()-1;
         int carry = 0;
         StringBuilder result = new StringBuilder();

         while (i>=0 || j>=0){
             int sum = carry;
             if(i>=0) sum += x.charAt(i--) - '0';
             if(j>=0) sum += y.charAt(j--) - '0';

             result.append(sum % 2);
             carry = sum / 2;
         }
         if(carry ==1){
             result.append(1);
         }
         return result.reverse().toString();
    }


    public static void main(String[] args){
        String x = "011011";
        String y = "1010111";
        System.out.println("Parsing method");
        System.out.println(addViaParse(x,y));

        System.out.println("Bitwise addition method");
        System.out.println(addViaAddition(x,y));


    }
}
