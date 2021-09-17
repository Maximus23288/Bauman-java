package Attempt1c3;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
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
}
