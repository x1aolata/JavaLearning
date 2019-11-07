package Hello;

public class Wolf extends Animal {

    public Wolf() {
        super("灰太狼", 3);
        System.out.println("Wolf 无参数构造器");
    }

    public static void main(String[] args) {
        new Wolf();
    }
}

class Creature {

    public Creature() {
        System.out.println("Creature 无参数构造器");
    }
}

class Animal extends Creature {
    public Animal(String name) {
        System.out.println("Animal 一个参数的构造器，name为：" + name);
    }

    public Animal(String name, int age) {
        this(name);
        System.out.println("Animal 两个参数的构造器，age为：" + age);

    }
}