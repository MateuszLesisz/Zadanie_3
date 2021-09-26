package pl.infoshare;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NumbersFromUser {
    private static boolean variable = true;


    public static void firstNumber() {
        while (variable) {
            try {
                System.out.println("Tell me what range of numbers to draw from:  ");
                Scanner scanner = new Scanner(System.in);
                int numberOfRangeOne = scanner.nextInt();
                if (numberOfRangeOne > 1) {
                    System.out.println("The numbers will be draw from 1 to " + numberOfRangeOne);
                    System.out.println();
                    break;
                } else {
                    System.out.println("Enter a number grather than 1.");
                    System.out.println();
                }
            } catch (Exception e) {
                System.out.println("You enter uncorrectly format. Try again.");
                System.out.println();

            }
        }
    }


    public static void secondNumber() {
        while (variable) {
            try {
                System.out.println("Enter how many numbers you want to draw  ");
                Scanner scanner = new Scanner(System.in);
                int numberOfRangeTwo = scanner.nextInt();
                if (numberOfRangeTwo > 0) {
                    System.out.println();
                    break;
                } else {
                    System.out.println("Enter a number grather than 1.");
                    System.out.println();
                }
            } catch (Exception e) {
                System.out.println("You enter uncorrectly format. Try again.");
                System.out.println();

            }
        }
    }
}
