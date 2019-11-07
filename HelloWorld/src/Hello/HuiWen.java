package Hello;

import java.util.Scanner;

public class HuiWen {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        StringBuffer s1 = new StringBuffer();
        String s = in.nextLine();
        s1.append(s);
        System.out.println(s.equals(s1.reverse().toString()));


    }

}
