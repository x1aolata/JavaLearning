package awtTest;

import javax.swing.*;
import java.awt.*;

public class JRaidoButtonTest {
    private Frame f = new Frame("测试");
    private Panel colorPanel = new Panel();
    private JRadioButton buttonRed = new JRadioButton("red");
    private JRadioButton buttonGreen = new JRadioButton("green");
    private JRadioButton buttonBlue = new JRadioButton("blue");

    public void init() {

        colorPanel.setLayout(new FlowLayout());
        ButtonGroup colorGroup = new ButtonGroup();

        colorGroup.add(buttonRed);
        colorGroup.add(buttonBlue);
        colorGroup.add(buttonGreen);


        buttonRed.addActionListener(e -> colorPanel.setBackground(Color.RED));
        buttonGreen.addActionListener(e -> colorPanel.setBackground(Color.GREEN));
        buttonBlue.addActionListener(e -> colorPanel.setBackground(Color.BLUE));

        buttonGreen.setBackground(Color.GREEN);

        colorPanel.add(buttonRed);
        colorPanel.add(buttonBlue);
        colorPanel.add(buttonGreen);

        f.add(colorPanel);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JRaidoButtonTest().init();
    }

}
