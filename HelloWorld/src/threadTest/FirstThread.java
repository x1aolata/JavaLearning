package threadTest;


import objectOriented.FinalErrorTest;

import java.awt.*;

public class FirstThread extends Thread {
    private int i;

    @Override
    public void run() {
        for (; i < 10; i++) {
            System.out.println(getName() + "  " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // 调用Thread的currentThread方法获取当前线程
            System.out.println(Thread.currentThread().getName()
                    + " " + i);
            if (i == 2) {
                // 创建、并启动第一条线程
                new FirstThread().start();
                // 创建、并启动第二条线程
                new FirstThread().start();
            }
        }


    }
}
