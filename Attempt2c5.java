package Attempt2c5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Choose one method to use:\n1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Factorial");
        Scanner s = new Scanner(System.in);
        int selection = s.nextInt();
        if (selection == 1) {
            MathUtils.add();
        }
        if (selection == 2) {
            MathUtils.sub();
        }
        if (selection == 3) {
            MathUtils.mul();
        }
        if (selection == 4) {
            MathUtils.dev();
        }
        if (selection == 5) {
            MathUtils.exp();
        }
        if (selection == 6) {
            MathUtils.fac();
        }
        else {
            System.out.println("Invalid input");
        }
    }
}

class MathUtils {
    public static void add() {
        System.out.print("Amount of numbers you want to add: ");
        Scanner s1 = new Scanner(System.in);
        int amount = s1.nextInt();
        double result = 0;
        for (int i = 0; i < amount; i++) {
            System.out.print("Input number: ");
            Scanner s2 = new Scanner(System.in);
            double num = s2.nextDouble();
            result = result + num;
        }
        System.out.print("Addition result: ");
        System.out.println(result);
    }

    public static void sub() {
        System.out.print("Input number to substract from: ");
        Scanner s1 = new Scanner(System.in);
        double num1 = s1.nextDouble();
        System.out.print("Input number to substract: ");
        Scanner s2 = new Scanner(System.in);
        double num2 = s2.nextDouble();
        double result = num1 - num2;
        System.out.print("Substraction result: ");
        System.out.println(result);
    }

    public static void mul() {
        System.out.print("Amount of numbers you want to multiply: ");
        Scanner s1 = new Scanner(System.in);
        int amount = s1.nextInt();
        double result = 0;
        for (int i = 0; i < amount; i++) {
            System.out.print("Input number: ");
            Scanner s2 = new Scanner(System.in);
            double num = s2.nextDouble();
            result = result + num;
        }
        System.out.print("Multiplication result: ");
        System.out.println(result);
    }

    public static void dev() {
        System.out.print("Input number to divide: ");
        Scanner s1 = new Scanner(System.in);
        double num1 = s1.nextDouble();
        System.out.print("Input number to divide on: ");
        Scanner s2 = new Scanner(System.in);
        double num2 = s2.nextDouble();
        double result = num1 - num2;
        System.out.print("Division result: ");
        System.out.println(result);
    }

    public static void exp() {
        System.out.print("Input number to exponent: ");
        Scanner s1 = new Scanner(System.in);
        double num = s1.nextDouble();
        System.out.print("Input number to exponent on: ");
        Scanner s2 = new Scanner(System.in);
        double up = s2.nextDouble();
        double result = Math.pow(num,up);
        System.out.print("Exponentiation result: ");
        System.out.println(result);
    }

    public static void fac() {
        System.out.print("Input number to factorial: ");
        Scanner s1 = new Scanner(System.in);
        int num = s1.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.print("Factorial result: ");
        System.out.println(result);
    }
}
