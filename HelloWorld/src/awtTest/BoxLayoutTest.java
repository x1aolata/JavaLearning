package awtTest;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutTest {
    private Frame f = new Frame("测试");
    public void init()
    {
        f.setLayout(new BoxLayout(f,BoxLayout.Y_AXIS));
        f.add(new Button("First Button"));
        f.add(new Button("Second Button"));
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutTest().init();
    }
}
