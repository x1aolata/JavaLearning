package homeWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class DrawCurve extends JFrame implements MouseListener, MouseMotionListener {

    private boolean isStart = true;
    private Point start, end, lastend;
    private Canvas canvas;

    public DrawCurve() {
        super("画曲线");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 400);
        this.start = this.end = this.lastend = null;
        this.canvas = new DrawLineCanvas();
        this.getContentPane().add(canvas);
        this.canvas.addMouseListener(this);
        this.canvas.addMouseMotionListener(this);

        this.setVisible(true);
    }


    public static void main(String[] args) {
        new DrawCurve();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    //鼠标按下
    @Override
    public void mousePressed(MouseEvent e) {
        this.start = new Point(e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        this.end = new Point(e.getX(), e.getY());
        this.canvas.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    private class DrawLineCanvas extends Canvas {
        @Override
        public void paint(Graphics g) {
            if (start != null && end != null) {
                g.setColor(Color.RED);
                g.drawOval(end.x, end.y, 2, 2);
            }
        }

        @Override
        public void update(Graphics g) {
            this.paint(g);
        }
    }
}

