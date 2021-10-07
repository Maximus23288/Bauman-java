package Attempt1h1;

import java.util.Scanner;

public class Main1h {
    static void add() {
        System.out.print("Input amount of numbers to add: ");
        Scanner s1 = new Scanner(System.in);
        int add_amount = s1.nextInt();

        double add_result = 0;
        for (int i = 0; i < add_amount; i++) {
            System.out.print("Input number to add: ");
            Scanner s2 = new Scanner(System.in);
            double add_num = s2.nextDouble();
            add_result = add_result + add_num;
        }

        System.out.print("Addition result: ");
        System.out.println(add_result);
    }

    static void sub() {
        System.out.print("Input number to substract from: ");
        Scanner s3 = new Scanner(System.in);
        double sub_num1 = s3.nextDouble();
        System.out.print("Input number to substract: ");
        Scanner s4 = new Scanner(System.in);
        double sub_num2 = s4.nextDouble();
        double sub_result = sub_num1 - sub_num2;
        System.out.print("Substraction result: ");
        System.out.println(sub_result);
    }

    static void mul() {
        System.out.print("Input amount of numbers to multiply: ");
        Scanner s5 = new Scanner(System.in);
        int mul_amount = s5.nextInt();

        double mul_result = 1;
        for (int i = 0; i < mul_amount; i++) {
            System.out.print("Input number to multiply: ");
            Scanner s6 = new Scanner(System.in);
            double mul_num = s6.nextDouble();
            mul_result = mul_result * mul_num;
        }

        System.out.print("Multiplication result: ");
        System.out.println(mul_result);
    }

    static void dev() {
        System.out.print("Input number to divide: ");
        Scanner s7 = new Scanner(System.in);
        double dev_num1 = s7.nextDouble();
        System.out.print("Input number to divide to: ");
        Scanner s8 = new Scanner(System.in);
        double dev_num2 = s8.nextDouble();
        double dev_result = dev_num1 / dev_num2;
        System.out.print("Division result: ");
        System.out.println(dev_result);
    }

    static void shell() {
        System.out.println("Welcome to my EvilCalc666!");
        System.out.println("Print 0 to do addition \nPrint 1 to do substraction \nPrint 2 to do multiplication \nPrint 3 to do division");
        Scanner s9 = new Scanner(System.in);
        int selected = s9.nextInt();
        if (selected == 0) {
            add();
        }
        else if (selected == 1) {
            sub();
        }
        else if (selected == 2) {
            mul();
        }
        else if (selected == 3) {
            dev();
        }
        else {
            System.out.println("Unappropriate select value!");
        }
    }

    public static void main(String[] args) {
        String select = "y";
        while (select.equals("y")) {
            System.out.println("Want to launch my EvilCalc666? Answer with only y/n please");
            Scanner s4 = new Scanner(System.in);
            String selection = s4.next();
            if (selection.equals("y")) {
                shell();
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
