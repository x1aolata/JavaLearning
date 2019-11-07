package Hello;

public class Test4 extends AA {


    int height;

    public Test4() {
    }

    public Test4(int height) {
        this.height = height;
    }

    public Test4(int age, String name, int height) {
        super(age, name);
        this.height = height;
    }

    @Override
    public void show() {
        System.out.println(height);
        System.out.println(age);
    }

    public static void main(String[] args) {
//        new Test4().show();
    }
}

class AA {
    int age;
    String name;

    public AA() {
    }

    public AA(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void show() {
        System.out.println("父类方法");
    }
}