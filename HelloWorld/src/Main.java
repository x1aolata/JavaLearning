import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String subs;
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            subs = in.nextLine();
            if (s.contains(subs))
                System.out.println(s.substring(s.indexOf(subs)));
            else
                System.out.println("Not Found");
        }
    }
}
