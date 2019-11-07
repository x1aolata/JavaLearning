package internalClass;

import interfaceTest.Output;

public class OuterClass {
    private int a;

    public InternalClass internalClass = new InternalClass(333);

    public OuterClass(int a) {
        this.a = a;
    }

    private class InternalClass {
        private int a;

        public InternalClass(int a) {
            this.a = a;
        }

        public void print() {
            System.out.println(a+a);
        }
    }

    public static void main(String[] args) {
//        OuterClass outerClass=new OuterClass(111);
//        outerClass.internalClass.print();
        class neibu{
            int a=3;
            void fun()
            {
                System.out.println(a);
            }
        }
        neibu n=new neibu();
        n.fun();
    }
}
