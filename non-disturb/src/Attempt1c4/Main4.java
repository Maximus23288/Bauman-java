package Attempt1c4;

import java.util.Scanner;

public class Main4 {
    static  void section() {
        System.out.print("Input section start: ");
        Scanner s1 = new Scanner(System.in);
        double start = s1.nextDouble();
        System.out.print("Input section end: ");
        Scanner s2 = new Scanner(System.in);
        double end = s2.nextDouble();
        System.out.print("Input point value: ");
        Scanner s3 = new Scanner(System.in);
        double point = s3.nextDouble();
        if ((point >= start) && (point <= end)) {
            System.out.println("Point is in the section");
        }
        else {
            System.out.println("Point is out of section");
        }
    }

    public static void main(String[] args) {
        String select = "y";
        while (select.equals("y")) {
            System.out.print("Want to launch my Awesome-section-counter?");
            Scanner s4 = new Scanner(System.in);
            String selection = s4.next();

        }
    }
}
