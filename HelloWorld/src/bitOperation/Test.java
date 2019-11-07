package bitOperation;

public class Test {

    public static void fun(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        // 亦或运算 ^ 两个位相同都为0，相异为1
        System.out.println("亦或运算结果是：" + (23 ^ 45));
        // 或运算 |  两个位都为0时，结果才为0
        System.out.println("或运算结果是：" + (23 | 45));
        // 与运算 &  两个位都为1时，结果才为1
        System.out.println("与运算结果是：" + (-23 & 45));
        // 取反 0变1，1变0
        System.out.println("取反结果是：" + ~23);
        // 向左移位 << 各位全部左移若干位，高位丢弃，低位补0
        System.out.println(-23 << 2);
        // 向右移位 >>      各二进位全部右移若干位，对无符号数，高位补0，有符号数，各编译器处理方法不一样，有
        //                 的补符号位（算术右移），有的补0（逻辑右移）
        System.out.println(23 >> 4);
        // 无符号右移 >>>
        System.out.println(-23 >>> 4);


    }
}
