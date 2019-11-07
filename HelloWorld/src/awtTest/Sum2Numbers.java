package awtTest;

import java.awt.*;
import java.awt.event.ActionListener;

public class Sum2Numbers {
    private Frame frame = new Frame("求和两个数");
    private TextField text1, text2, text3;
    private Button equal;

    public void init() {
        frame.setLayout(new FlowLayout());
        frame.setLocation(500, 500);

//        ActionListener actionListener = e ->
//        {
//            if (e.getActionCommand() == "=") {
//                text3.setText("" + (Integer.parseInt(text1.getText()) + Integer.parseInt(text2.getText())));
//            }
//        };

        text1 = new TextField(20);
        text2 = new TextField(20);
        text3 = new TextField(20);
        equal = new Button("=");
        equal.addActionListener(e ->
        {
            if (e.getActionCommand() == "=") {
                text3.setText("" + (Integer.parseInt(text1.getText()) + Integer.parseInt(text2.getText())));
            }
        });

        frame.add(text1);
        frame.add(new Label("+"));
        frame.add(text2);
        frame.add(equal);
        frame.add(text3);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Sum2Numbers().init();
    }

}
