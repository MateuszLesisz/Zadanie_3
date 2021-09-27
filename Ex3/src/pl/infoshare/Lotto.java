package pl.infoshare;

import java.lang.reflect.Array;
import java.util.*;

public class Lotto {

    public static void randomNumber() throws InterruptedException {
        ArrayList numbers  = new ArrayList();
        for (int i = 0; i < NumbersFromUser.getFirstNumberOfRange(); i++) {
            numbers.add(i+1);
        }
        Collections.shuffle(numbers);
        for(int j = 0; j < NumbersFromUser.getSecondNumberOfRange(); j++) {
            System.out.println(numbers.get(j));
            Thread.sleep(1000);
        }



    }

}
