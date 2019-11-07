package awtTest;

import java.awt.*;
import java.util.Random;
public class NullLayoutTest {

    Frame f = new Frame("测试窗口");
    Button b1 = new Button("Button1");
    Button b2 = new Button("Button2");
    public void init()
    { Random random = new Random();
        // 设置使用null布局管理器
        f.setLayout(null);
        // 下面强制设置每个按钮的大小、位置
        for (int i = 0; i <100 ; i++) {
            Button button = new Button("Button"+i);
            button.setBounds( random.nextInt(1000), random.nextInt(1000),random.nextInt(150), random.nextInt(150));
            f.add(button);
        }
        b1.setBounds(20, 30, 90, 28);
        f.add(b1);
        b2.setBounds(50, 45, 120, 35);
        f.add(b2);
        f.setBounds(50, 50, 200, 100);

        f.pack();
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new NullLayoutTest().init();
    }
}
