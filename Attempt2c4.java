package Attempt2c4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.print("Input cylinder radius: ");
        Scanner s = new Scanner(System.in);
        String rs = s.next();
        double r = Double.parseDouble(rs);
        System.out.print("Input cylinder height: ");
        String hs = s.next();
        double h = Double.parseDouble(hs);

        Cylinder c = new Cylinder();
        c.square(r,h);
        c.volume(r,h);
        c.square(rs,hs);
        c.volume(rs,hs);
    }
}

class Cylinder {
    public void square(double r, double h) {
        double square = (Math.PI * r * r * 2) + (2 * Math.PI * r * h);
        System.out.print("Cylinder square from double = ");
        System.out.println(square);
    }

    public void volume(double r, double h) {
        double volume = Math.PI * r * r * h;
        System.out.print("Cylinder volume from string = ");
        System.out.println(volume);
    }

    public void square(String rs, String hs) {
        double r = Double.parseDouble(rs);
        double h = Double.parseDouble(hs);
        double square = (Math.PI * r * r * 2) + (2 * Math.PI * r * h);
        System.out.print("Cylinder square from double = ");
        System.out.println(square);
    }

    public void volume(String rs, String hs) {
        double r = Double.parseDouble(rs);
        double h = Double.parseDouble(hs);
        double volume = Math.PI * r * r * h;
        System.out.print("Cylinder volume from string = ");
        System.out.println(volume);
    }
}
