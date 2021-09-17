package Attempt1c5;

import java.util.Arrays;
import java.util.Random;

public class Main5 {
    public static void main(String[] args) {
        int[] Array1 = new int[10];
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = new Random().nextInt(10);
        }
        for (int i = 0; i < Array1.length; i++) {
            System.out.print(Array1[i]);
        }
        System.out.println();
        int[] Array2 = new int[10];
        for (int i = 0; i < Array2.length; i++) {
            Array2[i] = new Random().nextInt(10);
        }
        for (int i = 0; i < Array2.length; i++) {
            System.out.print(Array2[i]);
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < Array1.length; i++) {
            if (Array1[i] == Array2[i]) {
                count++;
                System.out.print(i);
            }
        }
        System.out.println();
        System.out.print("Number of same objects in arrays: ");
        System.out.println(count);
    }
}
