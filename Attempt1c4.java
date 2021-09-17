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
        while (true) {
            System.out.println("Want to launch my Awesome-section-counter? Answer with only y/n please");
            Scanner s4 = new Scanner(System.in);
            String selection = s4.next();
            if (selection.equals("y")) {
                section();
            }
            if (selection.equals("n")) {
                break;
            }
            else {
                System.out.println("Wrong answer, try again");
            }
        }
    }
}
