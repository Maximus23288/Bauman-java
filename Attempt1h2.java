package Attempt1h2;

import java.util.Scanner;

public class Main2h {
    public static void main(String[] args) {
        String[] Names = {"Max", "Alex", "Pavel", "Maria", "Anna", "Greg", "Steeve"};
        System.out.println("Input any name you want to check");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        int pos = -1;
        for (int i = 0; i < Names.length; i++) {
            if (Names[i].equals(name)) {
                pos = i;
            }
        }
        if (pos != -1) {
            System.out.print("Name is in the list. List position: ");
            System.out.println(pos);
        }
        else {
            System.out.println("Name is not in the list");
        }
    }
}
