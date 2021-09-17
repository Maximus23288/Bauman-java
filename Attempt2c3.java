package Attempt2c3;

public class Main3 {
    public static void main(String[] args) {
        A a = new A();
        a.count(2,3);
        a.show();

        B b = new B();
        b.count(2,3);
        b.show();

        C c = new C();
        c.count(2,3);
        c.show();

        D d = new D();
        d.count(4,2);
        d.show();
    }
}

class A {
    public void count(int a, int b) {
        int sum = a + b;
        System.out.print("Sum: ");
        System.out.println(sum);
    }

    public void show() {
        System.out.println("Class name = A");
    }
}

class B extends A {
    public void count(int a, int b) {
        int sub = 0;
        if (a >= b) {
            sub = a - b;
        }
        if (b > a) {
            sub = b -a;
        }
        System.out.print("Sub: ");
        System.out.println(sub);
    }

    public void show() {
        System.out.println("Class name = B");
    }
}

class C extends A {
    public void count(int a, int b) {
        int mul = a * b;
        System.out.print("Mul: ");
        System.out.println(mul);
    }

    public void show() {
        System.out.println("Class name = C");
    }
}

class D extends B {
    public void count(int a, int b) {
        int dev = a / b;
        System.out.print("Dev: ");
        System.out.println(dev);
    }

    public void show() {
        System.out.println("Class name = D");
    }
}
