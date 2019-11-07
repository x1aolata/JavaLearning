package internalClass;

public class AnonymousTest {
    public void test(Product p) {
        System.out.println(p.getName() + "   " + p.getPrice());
    }

    public void test(Device d) {
        System.out.println(d.getName() + "   " + d.getPrice());
    }

    public static void main(String[] args) {
        AnonymousTest anonymousTest = new AnonymousTest();
//        anonymousTest.test(new Product() {
//            @Override
//            public double getPrice() {
//                return 23;
//            }
//
//            @Override
//            public String getName() {
//                return "好吃的";
//            }
//        });
        anonymousTest.test(new Device("汽车") {
            {
                this.setName("火车");
            }
        });

    }
}

