package homeWork;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class DrawMoon {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1000, 400);
        frame.setLocation(100, 100);
        MyMoonPanel panel = new MyMoonPanel();
        frame.add(panel);
        panel.startRun();
        frame.setVisible(true);
    }
}

class MyMoonPanel extends JPanel {

    int x = 500;

    public void startRun() {
        new Thread() {
            public void run() {
                while (true) {
                    for (int i = 0; i < 1000; i++) {
                        x += 3;
                        if (x > 1000) {
                            x = 0;
                        }

                        try {
                            //让线程休眠10毫秒
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        repaint();
                    }
                }
            }
        }
        .start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        this.setBackground(Color.black);
        //月亮
        g.setColor(Color.YELLOW);
        g.fillArc(400, 100, 200, 200, 0, 360);
        //设置将去覆盖月亮的黑色圆
        g.setColor(Color.BLACK);
        g.fillArc(x, 100, 200, 200, 0, 360);
    }
}

