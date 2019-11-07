package awtTest;

import java.awt.*;
import java.awt.event.ActionListener;

public class DialogTest {
    Frame f = new Frame("测试");
    Dialog d1 = new Dialog(f, "模式对话框", true);
    Dialog d2 = new Dialog(f, "非模式对话框", false);
    Button b1 = new Button("Open modal dialog");
    Button b2 = new Button("Open non-modal dialog");

    public void init() {
        d1.setBounds(20, 30, 300, 400);
        d2.setBounds(20, 30, 300, 400);
        b1.addActionListener(e -> d1.setVisible(true));
//        ActionListener
        b2.addActionListener(e -> d2.setVisible(true));
        f.add(b1);
        f.add(b2, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new DialogTest().init();
    }
}
