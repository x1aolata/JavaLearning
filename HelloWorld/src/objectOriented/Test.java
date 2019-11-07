package objectOriented;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Test {

    public static int a;

    static {
        a = 5;
    }

    {
        a = 7;
    }

    @Override
    protected void finalize() {
        System.out.println("Test 类已析构");

    }


    public static void main(String[] args) {


        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1 == s2);

    }

}

