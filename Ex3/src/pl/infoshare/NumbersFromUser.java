package pl.infoshare;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NumbersFromUser {
    private static boolean variable = true;
    private static int firstNumberOfRange;
    private static int secondNumberOfRange;

    public static void firstNumber() {
        while (variable) {
            try {
                System.out.println("Tell me what range of numbers to draw from:  ");
                Scanner scanner = new Scanner(System.in);
                firstNumberOfRange = scanner.nextInt();
                if (firstNumberOfRange > 1) {
                    System.out.println("The numbers will be draw from 1 to " + firstNumberOfRange);
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
                secondNumberOfRange = scanner.nextInt();;
                if (secondNumberOfRange > 0 && secondNumberOfRange < firstNumberOfRange) {
                    System.out.println();
                    break;
                } else if (secondNumberOfRange > firstNumberOfRange) {
                    System.out.println("The number of numbers to be drawn must be smaller than the interval from which the numbers will be drawn. Give a number less than " + firstNumberOfRange);
                    System.out.println();
                } else if (secondNumberOfRange < 0) {
                    System.out.println("Enter a number grather than 0.");
                    System.out.println();
                }
            } catch (Exception e) {
                System.out.println("You enter uncorrectly format. Try again.");
                System.out.println();

            }
        }
    }
}
