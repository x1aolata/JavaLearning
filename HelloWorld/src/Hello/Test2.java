package Hello;

import java.util.Arrays;

public class Test2 {

   private int number;

    public static void show(int... books) {
        for (int s : books) {
            System.out.println(s);
        }
    }

    public static int fn(int n) {
        if (n == 20)
            return 1;
        else if (n == 21)
            return 4;
        else
            return fn(n + 2) - 2 * fn(n + 1);
    }


    public static void fun(String s) {
        System.out.println("一个参数");

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static void fun(String... s) {
        System.out.println("很多参数");
    }

    public static void main(String[] args) {

//        String[] strings = new String[]{"陈二狗", "蒋若辉", "陈浩"};
//       show(1,2,3,4);

//        System.out.println(fn(19));
//        fun("23131","123","2sad");
        int s = 9;

        System.out.println(s);
    }
}
