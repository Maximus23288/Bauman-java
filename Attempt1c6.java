package Attempt1c6;

import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Array = new String[15];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.next();
        }
        Arrays.sort(Array);
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]);
        }
        System.out.println();
        String[] Array_new = new String[10];
        for (int i = 0; i < 5; i++) {
            Array_new[i] = Array[i];
        }
        int j = 10;
        for (int i = 5; i < Array_new.length; i++) {
            Array_new[i] = Array[j];
            j++;
        }
        for (int i = 0; i < Array_new.length; i++) {
            System.out.print(Array_new[i]);
        }
    }
}
