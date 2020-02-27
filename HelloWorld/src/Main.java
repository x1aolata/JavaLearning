import java.util.Scanner;

class A {
    void run() {
        System.out.println("A");
    }

    void f() {
        System.out.println("AFF");
    }
}

class B extends A {
    @Override
    void run() {
        System.out.println("B");
    }
}

class C extends A {
    @Override
    void run() {
        System.out.println("C");
    }


}

class Main {


    public static void main(String[] args) {
        A a = new B();
        a.run();
        a = new C();
        a.run();


    }


}
