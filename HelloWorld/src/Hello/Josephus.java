package Hello;

import java.util.Arrays;
import java.util.Scanner;

public class Josephus {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int d = in.nextInt();
        int count = 1;
        int ss = n;
        boolean[] person = new boolean[10000];
        Arrays.fill(person, true);

        for (int i = s; i < n; i++) {
            if (person[i]) {
                if (count == d) {
                    ss--;
                    count = 1;
                    person[i] = false;
                    System.out.println(String.valueOf(i) + " is dead.");

                    if (ss == 1) {
                        break;
                    }
                } else {
                    count++;
                }
            }

            if (i == n - 1) {
                i = -1;
            }

        }
        for (int j = 0; j < n; j++) {
            if (person[j]) {
                System.out.println(String.valueOf(j) + " is alive.");
                break;
            }
        }


    }

}
