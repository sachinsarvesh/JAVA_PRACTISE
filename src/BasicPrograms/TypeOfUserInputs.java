package BasicPrograms;

import java.io.*;

import java.util.Scanner;

public class TypeOfUserInputs {

    public static void main(String[] args) throws IOException{

        //Buffered Reader
        System.out.println("Buffered Reader, Start typing...");
        BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
        String output1 = input1.readLine();
        System.out.println("Value : " + output1);

        // Scanner
        System.out.println("Scanner Reader, Start typing...");
        Scanner input2 = new Scanner(System.in);
        String output2 = input2.nextLine();
        System.out.println("Value : " + output2);

        //DataInputStream
        DataInputStream input4 = new DataInputStream(System.in);
        System.out.println("DataInputStream Reader, Start typing...");
        System.out.print("Enter an integer: ");
        int i = Integer.parseInt(input4.readLine());

        System.out.print("Enter a string: ");
        String s = input4.readLine();

        System.out.println("You entered integer: " + i);
        System.out.println("You entered string: " + s);

        // Console - To get value cia console
        Console console = System.console();
        if (console == null) {
            System.out.println("Console not available");
            return;
        }
        String output3 = console.readLine("Console Reader, Start typing...");
        System.out.println("Value : " + output3);

    }
}
