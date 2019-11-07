package awtTest;

import javax.swing.*;
import java.awt.*;

public class BoxTest {
    private Frame f = new Frame("测试");
    // 定义水平摆放组件的Box对象
    private Box horizontal = Box.createHorizontalBox();
    // 定义垂直摆放组件的Box对象
    private Box vertical = Box.createVerticalBox();
    public void init()
    {
        horizontal.add(new Button("Horizontal 1"));
        horizontal.add(new Button("Horizontal 2"));
        vertical.add(new Button("Vertical 1"));
        vertical.add(new Button("Vertical 2"));
        f.add(horizontal , BorderLayout.NORTH);
        f.add(vertical);
        f.pack();
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new BoxTest().init();
    }
}
