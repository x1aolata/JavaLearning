package Hello;

class Fu {
    public int num = 111;

    void show() {
        System.out.println(num);
    }
}


class Fufu extends Fu {

    public int num = 222;

    @Override
    void show() {
        System.out.println(num);
    }
}

class Zi extends Fu {

    public int num = 333;

    @Override
    void show() {
        System.out.println(num);
    }
}


class learning {
    public static void main(String[] args) {


        Zi g = new Zi();
        g.show();


    }
}
