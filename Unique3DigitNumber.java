package _2_;

import java.util.ArrayList;

public class Unique3DigitNumber {
    public static void main(String[] args) {
        //Q :  Write a Java program to create and display unique three-digit number using 1, 2, 3, 4.
        // Also count how many three-digit numbers are there.

        int count = 0;
        ArrayList<String> box = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k <= 4; k++) {
                for (int j = 1; j <= 4; j++) {
                    if (i != k && i != j && k != j) {
                        count++;
                        box.add(i+""+j+""+k);

                    }
                }
            }
        }

        System.out.println(box);
        System.out.println("count = " + count);
    }
}