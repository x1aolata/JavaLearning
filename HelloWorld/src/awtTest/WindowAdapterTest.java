package awtTest;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterTest {
    private Frame f = new Frame("测试");
    private TextArea ta = new TextArea(6,10);
    public void init()
    {
        f.addWindowListener(new MyListenter());
        f.add(ta);
        f.pack();
        f.setVisible(true);
    }

    class  MyListenter extends WindowAdapter
    {
        @Override
        public void windowClosing(WindowEvent e) {
            super.windowClosing(e);
            System.out.println("用户关闭窗口");
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new WindowAdapterTest().init();
    }
}
