package awtTest;

import java.awt.*;

public class Test extends Frame {
    public Test() {
        super("图形界面");
        this.setSize(400, 400);
        this.setLayout(new FlowLayout());
        this.add(new TextField("10", 8));
        this.add(new Button("按钮"));
        this.add(new TextField("10", 8));
        this.setVisible(true);
    }

    public static void main(String[] args) {
//        Frame frame = new Frame("测试窗口");
//        frame.setLayout(new BorderLayout());
//
//        Panel panel = new Panel();
//        panel.add(new TextField(20));
//        panel.add(new Button("Button"));
//
//
//        frame.add(new Button("CENTER"), BorderLayout.CENTER);
//        frame.add(new Button("NORTH"), BorderLayout.NORTH);
//        frame.add(new Button("SOUTH"), BorderLayout.SOUTH);
//        frame.add(panel, BorderLayout.WEST);
//        frame.add(new Button("EAST"), BorderLayout.EAST);
//
//
//        frame.pack();
//        frame.setVisible(true);

        Frame f = new Frame("计算器");
        Panel p1 = new Panel();
        p1.add(new TextField(30));
        f.add(p1 , BorderLayout.NORTH);
        Panel p2 = new Panel();
        // 设置Panel使用GridLayout布局管理器
        p2.setLayout(new GridLayout(3, 5 , 4, 4));
        String[] name = {"0" , "1" , "2" , "3"
                , "4" , "5" , "6" , "7" , "8" , "9"
                , "+" , "-" , "*" , "/" , "."};
        // 向Panel中依次添加15个按钮
        for (int i = 0 ; i < name.length; i++ )
        {
            p2.add(new Button(name[i]));
        }
        // 默认将Panel对象添加Frame窗口的中间
        f.add(p2);
        // 设置窗口为最佳大小
        f.pack();
        // 将窗口显示出来（Frame对象默认处于隐藏状态）
        f.setVisible(true);


    }
}
