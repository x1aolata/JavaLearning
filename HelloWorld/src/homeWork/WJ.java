package homeWork;


import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class WJ extends JFrame {

    MyMoonPanel panel = new MyMoonPanel();

    public WJ() {
        super("月食");
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(panel);
        Thread tad = new Thread(panel);
        tad.start();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new WJ();
    }


    class MyMoonPanel extends JPanel implements Runnable {
        int x = 700;

        public void paint(Graphics g) {
            super.paint(g);        //设置背景
            this.setBackground(Color.black);
            g.setColor(Color.yellow);
            g.fillArc(500, 100, 200, 200, 0, 360);        //设置将去覆盖月亮的黑色圆
            g.setColor(Color.black);
            g.fillArc(x, 100, 200, 200, 0, 360);
        }

        @Override
        public void run() {
            while (true) {
                //让要去覆盖月亮的黑圆的横坐标坐标不断自增
                // 这样去接近月亮和远离，造成月亮变化的效果

                    x--;
                    if (x < 0) {
                            x = 800;
                    }

                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                //刷新屏幕，自动调用paint()方法
                repaint();

            }
        }
    }

}