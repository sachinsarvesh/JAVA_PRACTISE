package Strings;

import java.util.Scanner;

public class CountNumOfChar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to count the length");
        String word = scanner.nextLine();
        System.out.println("The count of word - \"" + word +"\" is " + word.length());
    }
}
