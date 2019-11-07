package Hello;

public class helloworld {

    public void hello() {
        System.out.println("你好啊，朋友！");
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 4, 7, 3, 2, 1, 8, 9, 2, 6, 41, 24, 677, 123};
        // 创建指定长度的线程数组
        SortThread[] sortThreads = new SortThread[arr.length];
        // 指定每个线程数组的值
        for (int i = 0; i < sortThreads.length; i++) {
            sortThreads[i] = new SortThread(arr[i]);
        }

        // 开启每个线程
        for (int i = 0; i < sortThreads.length; i++) {
            sortThreads[i].start();
        }
    }

}

class SortThread extends Thread {
    int s = 0;

    public SortThread(int s) {
        this.s = s;
    }

    public void run() {
        try {
            sleep(s * 10 + 10); // 睡眠指定的时间
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  输出该数
        System.out.println(s);
    }
}

