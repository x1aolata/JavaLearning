package objectOriented;

public class FinalErrorTest {
    final int age;

    {
//        System.out.println(age);
        printAge();
        age = 4;
        System.out.println(age);
    }

    public void printAge() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        new FinalErrorTest();
    }
}
