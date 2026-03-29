package Strings;

public class Palindrome {
    public static void main(String[] args){
        String AS = "madam";
        String RS = new StringBuilder(AS).reverse().toString();

//        if (AS.equals(RS)){
//            System.out.println("Palindrome");
//        } else
//            System.out.println("Not a palindrome");

        System.out.println(AS.equals(RS) ? "Palindrome" : "Not a palindrome");


        // Method 2 - Two pointer
        int left = 0;
        int right = AS.length()-1;
        boolean flage = true;
        while(left < right){
            if(AS.charAt(left++) != AS.charAt(right--)){
//                System.out.println("Not a palindrome");
                flage = false;
                break;
            }
        }

        System.out.println(flage == true ? "Palindrome" : "Not a palindrome");









    }
}
