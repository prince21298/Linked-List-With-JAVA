package demo;

import java.util.Scanner;

public class breakStatement {
    public void mainData(String args) {
        boolean t = false;
        first: {
            second: {
                third: {
                    System.out.println("Before the break statement");
                    if (t)
                        break second;
                    else {
                        break third;
                    }
                }
                if (t)
                    break first;
                System.out.println("This won't execute.");
            }
            System.out.println("This is after the second block.");
        }
        System.out.println("This is after the frist block.");
    }

    public static void main(String[] args) {
        breakStatement breakStatementClass = new breakStatement();
        breakStatementClass.mainData(null);
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter your Number .. ");
        int n = inputScanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("GFG");
                break;
            case 2:
                System.out.println("Second Case");
                break;
            default:
                System.out.println("default case");
        }
        inputScanner.close();
    }
}
