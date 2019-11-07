package awtTest;

import java.awt.*;
import java.awt.event.ActionListener;

public class CardLayoutTest {

    Frame f = new Frame("测试窗口");
    String[] names = {"1", "2", "3", "4", "5"};
    Panel pl = new Panel();

    public void init() {
        final CardLayout c = new CardLayout(50, 50);
        pl.setLayout(c);
        for (int i = 0; i < names.length; i++) {
            pl.add(names[i], new Button(names[i]));
        }
        Panel p = new Panel();
        ActionListener listener = e ->
        {
            switch (e.getActionCommand()) {
                case "Last one":
                    c.previous(pl);
                    break;
                case "Next one":
                    c.next(pl);
                    break;
                case "first":
                    c.first(pl);
                    break;
                case "last":
                    c.last(pl);
                    break;
                case "Third sheets":
                    c.show(pl, "3");
                    break;
            }
        };
        // 控制显示上一张的按钮
        Button previous = new Button("Last one");
        previous.addActionListener(listener);
        // 控制显示下一张的按钮
        Button next = new Button("Next one");
        next.addActionListener(listener);
        // 控制显示第一张的按钮
        Button first = new Button("first");
        first.addActionListener(listener);
        // 控制显示最后一张的按钮
        Button last = new Button("last");
        last.addActionListener(listener);
        // 控制根据Card名显示的按钮
        Button third = new Button("Third sheets");
        third.addActionListener(listener);
        p.add(previous);
        p.add(next);
        p.add(first);
        p.add(last);
        p.add(third);
        f.add(pl);
        f.add(p, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutTest().init();
    }
}
