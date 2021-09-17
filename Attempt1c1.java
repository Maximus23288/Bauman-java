package Attempt1c1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input first number: ");
        Scanner s1 = new Scanner(System.in);
        String num1 = s1.next();
        System.out.print("Input second number: ");
        Scanner s2 = new Scanner(System.in);
        String num2 = s2.next();

        int ix1 = Integer.parseInt(num1);
        int ix2 = Integer.parseInt(num2);
        double dx1 = Double.parseDouble(num1);
        double dx2 = Double.parseDouble(num2);
        int ix = ix1 + ix2;
        double dx = dx1 + dx2;

        System.out.print("Summ of 2 int numbers: ");
        System.out.println(ix);
        System.out.print("Summ of 2 double numbers: ");
        System.out.println(dx);
    }
}
