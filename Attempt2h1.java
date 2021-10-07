package com.Attempt2h1;

import java.util.Scanner;

public class Main1h {

    public static void main(String[] args) {
        String i;
        String m;
        double m1 = -1;
        String w;
        double w1 = -1;
        Car car;

        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Write car model name (required): ");
            String model = in.nextLine();

            System.out.println("Do you want to enter max speed (optional)? (y/n)");
            m = in.next();
            if ("y".equals(m)) {
                System.out.print("Enter max speed: ");
                m1 = in.nextDouble();
            }

            System.out.println("Do you want to enter weight (optional)? (y/n)");
            w = in.next();
            if ("y".equals(w)) {
                System.out.print("Enter weight: ");
                w1 = in.nextDouble();
            }

            if ("y".equals(m) && "y".equals(w)) {
                car = new Car(model, m1, w1);
            } else if ("y".equals(m)) {
                car = new Car(model, m1);
            } else {
                car = new Car(model);
            }

            car.show();

            System.out.println("Do you want to continue? (y/n)");

            i = in.next();
        } while (!i.equals("n"));
    }
}

package com.company;

public class Car {
    private final String model;
    private double maxSpeed = -1;
    private double weight = -1;

    public Car(String m) {
        this.model = m;
    }

    public Car(String s, double m1) {
        this.model = s;
        this.maxSpeed = m1;
    }

    public Car(String s, double m1, double w) {
        this.model = s;
        this.maxSpeed = m1;
        this.weight = w;
    }

    public void show() {
        System.out.println("Model: " + model);
        if (maxSpeed != -1) {
            System.out.println("Max speed: " + maxSpeed);
        }
        if (weight != -1) {
            System.out.println("Weight: " + weight);
        }
    }
}
