package exceptionTest;

public class MyException {

    public static void main(String[] args) {

        try {
              throw new NullPointerException("chenergou");
    } catch (Exception e) {
        if (e.getMessage() == "chenergou") {
            System.out.println("null");
        }
    } finally {
        System.out.println("完事了");
    }

    }
}
