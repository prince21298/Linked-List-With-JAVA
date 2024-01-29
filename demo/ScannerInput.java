package demo;

import java.util.Scanner;

public class ScannerInput {
    static Scanner input = new Scanner(System.in);
    public void stringInput(){
        System.out.print("Please enter a first String: ");
        String inputString = input.next();
        System.out.print("Please enter a second String: ");
        String inputString2 = input.next();
        String concatenation = inputString + inputString2;
        System.out.println("Your output is: " + concatenation);
    }

    public void intInput(){
        System.out.print("Please enter a first Number: ");
        int inputNum1 = input.nextInt();
        System.out.print("Please enter a second Number: ");
        int inputNum2 = input.nextInt();
        int sum = inputNum1 + inputNum2;
        System.out.println("Your output is: " + sum);
    }

    public static void main(String[] args) {
        ScannerInput scannerInputClass = new ScannerInput();
        scannerInputClass.stringInput();
        scannerInputClass.intInput();
        input.close();
    }

}
