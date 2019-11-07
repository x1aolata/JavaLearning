package Hello;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.util.Arrays.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static int MAX = 123;
    public int number;
    public int age;
    public boolean ism = false;
    public int s;



    {
        System.out.println("普通初始化");
        this.number = 1;
        this.age = 2;
        this.ism = true;
        this.s = 100;
    }


    public Test() {
    }

    public Test(int number, int age, boolean ism) {
        this.number = number;
        this.age = age;
        this.ism = ism;
        System.out.println("构造器");
    }
    {
        System.out.println("普通初始化2");
        this.number = 1;
        this.age = 2;
        this.ism = true;
        this.s = 100;
    }
    static {
        System.out.println("静态初始化");
    }

    public void fun(int n) {
        f1();
        for (int i = 0; i < n; i++)
            System.out.println(ism);

    }

    public void f1() {
        System.out.println("hello");
    }

    public static void f2() {
        System.out.println("hello");

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("开始执行");
        Test test = new Test(12, 12, false);
//        System.out.println(test.age);
//        System.out.println(test.number);
//        System.out.println(test.s);
//        System.out.println(test.ism);
//        System.out.println(test.MAX);
//        test.fun(3);

        int[] ints = new int[20];
        fill(ints, 4);
        System.out.println(Arrays.toString(ints));

    }

}

