package Attempt1c2;
import java.util.Scanner;

public class Main2 {
    static void cube() {
        System.out.print("Input parallelogram length: ");
        Scanner s1 = new Scanner(System.in);
        double cube_length = s1.nextDouble();
        System.out.print("Input parallelogram width: ");
        Scanner s2 = new Scanner(System.in);
        double cube_width = s2.nextDouble();
        System.out.print("Input parallelogram height: ");
        Scanner s3 = new Scanner(System.in);
        double cube_height = s3.nextDouble();
        double cube_volume = cube_length * cube_width * cube_height;
        System.out.print("Parallelogram volume: ");
        System.out.println(cube_volume);
    }

    static  void sphere() {
        System.out.print("Input sphere radius: ");
        Scanner s4 = new Scanner(System.in);
        double sphere_r = s4.nextDouble();
        double sphere_volume = 4.0/3 * Math.PI * sphere_r * sphere_r * sphere_r;
        System.out.print("Sphere volume: ");
        System.out.println(sphere_volume);
    }

    static  void cylinder() {
        System.out.print("Input cylinder radius: ");
        Scanner s5 = new Scanner(System.in);
        double cylinder_r = s5.nextDouble();
        System.out.print("Input cylinder height: ");
        Scanner s6 = new Scanner(System.in);
        double cylinder_h = s6.nextDouble();
        double cylinder_volume = cylinder_h * Math.PI * cylinder_r * cylinder_r;
        System.out.print("Cylinder volume: ");
        System.out.println(cylinder_volume);
    }

    public static void main(String[] args) {
        System.out.println("Welcome in Volumefinder3000!");
        System.out.println("To find parallelogram volume type 0 \nTo find sphere volume type 1 \nTo find cylinder volume type 2");
        Scanner s7 = new Scanner(System.in);
        int select = s7.nextInt();
        if (select == 0) {
            cube();
        }
        if (select == 1) {
            sphere();
        }
        if (select == 2) {
            cylinder();
        }
        else {
            System.out.println("Unappropriate select value!");
        }
    }
}
