package awtTest;

import objectOriented.Circle;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Moon extends Thread {
    private JFrame jFrame = new JFrame("月亮");
    private Canvas canvas;
    int Time=0;
    int X = 200;
    int Y = 700;
    private final int HEIGHT = 800;
    private final int WIDTH = 1600;


    public void init() {
        canvas = new DrawMoonCanvas();
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setBounds(200, 100, WIDTH, HEIGHT);
        jFrame.getContentPane().add(canvas);
        jFrame.setVisible(true);
    }

    @Override
    public void run() {
        init();
        while (true) {
            try {
                canvas.repaint();
                Thread.sleep(1);
                if(X<800)
                {
                    X+=2;
                    Y-=1;
                }
                else
                {
                    X+=2;
                    Y+=1;
                }
                if(X>1400)
                    break;

            } catch (InterruptedException ex) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        new Moon().start();

    }


    class DrawMoonCanvas extends Canvas {
        @Override
        public void paint(Graphics g) {
            g.setColor(Color.BLUE);
            g.drawOval(X, Y, 30, 30);

        }

        @Override
        public void update(Graphics g) {
            this.paint(g);
        }
    }
}


