package Strings;

public class StringReverse {
    public static void main(String[] args){
        String actualString = "SACHINSARVESH";

        //Method 1 - inbuilt method
        String reveredString = new StringBuilder(actualString).reverse().toString();
        System.out.println("Method 1 - inbuilt method - " + reveredString);
        //System.out.println("Actual String : " + actualString);
        //System.out.println("Reversed String : " + reveredString);

        //Method 2 - looping
        String reversedViaLoop ="";
        for (int i = actualString.length() -1; i>=0 ; i--){
            reversedViaLoop += actualString.charAt(i);
        }
        System.out.println("Method 2 - looping method - " +reversedViaLoop);
        //System.out.println("Actual String : " + actualString);
        //System.out.println("Reversed String : " + reversedViaLoop);

        //Method 3 - Two Pointer
        char[] chars = actualString.toCharArray();
        int left = 0;
        int right = actualString.length()-1;

        while(left < right){
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
            //left++;
            //right--;
        }
        String reveredViaTP = new String(chars);
        System.out.println("Method 3 - Two pointer method : " + reveredViaTP);

    }
}
