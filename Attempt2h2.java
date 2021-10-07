package Attempt2h2;

import java.util.Scanner;

public class Main2h {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a:");
        double a = in.nextDouble();
        System.out.print("Enter b:");
        double b = in.nextDouble();
        System.out.print("Enter c:");
        double c = in.nextDouble();

        Cube q = new Cube(a, b, c);

        System.out.println("Volume: " + Cube.getVolume(q) + "\nSquare: " + Cube.getSquare(q));
    }
}

public class Cube {
    private double a;
    private double b;
    private double c;

    public Cube(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public static double getVolume(Cube c) {
        return c.getA() * c.getB() * c.getC();
    }

    public static double getSquare(Cube c) {
        return 2 * (c.getA() * c.getB() + c.getB() * c.getC() + c.getC() * c.getA());
    }
}
