package Hello;

import java.util.Scanner;

public class Num {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);


        for (int i = 1; i <= 500; i++) {
            if (i == get(get(i)))
                if (i == get(i)) {
                    System.out.println(String.valueOf(i) + " is Perfect Number.");
                } else {
                    System.out.println(String.valueOf(i) + ':' + String.valueOf(get(i)));
                }

        }

    }

    public static int get(int num) {
        int count = 0;
        for (int j = 1; j < num; j++) {
            if (num % j == 0)
                count += j;
        }
        return count;
    }

}