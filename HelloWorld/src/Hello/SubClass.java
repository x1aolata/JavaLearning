package Hello;

public class SubClass extends BaseClass {

    public String book = "小邋遢";

    @Override
    public void test() {
        System.out.println("子类复写的方法");
    }

    public void sub() {
        System.out.println("子类的新方法");
    }

    public static void main(String[] args) {

        BaseClass baseClass = new BaseClass();
        System.out.println(baseClass.book);
        baseClass.base();
        baseClass.test();
        System.out.println();

        SubClass subClass = new SubClass();
        System.out.println(subClass.book);
        subClass.test();
        subClass.sub();
        subClass.base();
        System.out.println();


        BaseClass baseClass1 = new SubClass();
        System.out.println(baseClass1.book);
        baseClass1.test();
        baseClass1.base();
        System.out.println();

        String s = "asd";
        System.out.println(s instanceof Object);

    }

}

class BaseClass {
    public int book = 6;

    public void base() {
        System.out.println("父类的普通方法");
    }

    public void test() {
        System.out.println("父类的被覆盖的方法");
    }
}