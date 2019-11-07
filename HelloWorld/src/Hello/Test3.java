package Hello;

/*
 *构造器代码重用
 *
 */
public class Test3 {

    private int age;
    private String name;
    private boolean ism;

    public Test3() {
    }

    public Test3(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Test3(int age, String name, boolean ism) {
        this(age, name);
        this.ism = ism;
    }

    public static void main(String[] args) {

        Test3 test3 =new Test3(20,"蒋若辉",true);
//        Test3 test3 =new Test3(20,"蒋若辉");
        System.out.println(test3.age);
        System.out.println(test3.name);
        System.out.println(test3.ism);



    }
}
