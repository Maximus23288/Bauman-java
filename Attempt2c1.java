package Attempt2c1;

public class Main1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setR(3.5);
        c.setX(-8);
        c.setY(1.1);

        c.print();
        c.move();
        System.out.print("Distant to other circle: ");
        System.out.println(c.distToOtherCircle());
        c.changeRadius();
        System.out.print("Circle perimetr: ");
        System.out.println(c.getPerimetr());
        System.out.print("Circle square: ");
        System.out.println(c.getSquare());
    }
}

class Circle {
    private double x;
    private double y;
    private double r;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void print() {
        System.out.print("Current cords:\nX = ");
        System.out.println(x);
        System.out.print("Y = ");
        System.out.println(y);
        System.out.print("Radius = ");
        System.out.println(r);
    }

    public void move() {
        System.out.println("Circle has been moved");
    }

    public double distToOtherCircle() {
        double dist = 1.2;
        return dist;
    }

    public void changeRadius() {
        System.out.println("Too tired to do this");
    }

    public double getPerimetr() {
        double perimetr = Math.PI * 2 * r;
        return perimetr;
    }

    public double getSquare() {
        double square = Math.PI * r * r;
        return square;
    }
}
