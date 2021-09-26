package pl.infoshare;

import java.util.LinkedList;
import java.util.Random;

public class Lotto {

    public static void generowanieRandomowejLiczby() {
        int[] Array = new int[NumbersFromUser.getSecondNumberOfRange()];
        for (int i = 0; i<Array.length; i++) {
            Random randomNumber = new Random();
            int number = randomNumber.nextInt(NumbersFromUser.getFirstNumberOfRange()) + 1;
            Array[i] = number;

            System.out.println(number);
        }
    }

}
