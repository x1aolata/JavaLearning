package swingTest;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Exam02 {
    private JFrame jFrame = new JFrame("Exam02");
    private JTextField jText1 = new JTextField(10);
    private JTextField jText2 = new JTextField(10);
    private JTextField jText3 = new JTextField(10);
    JButton jbutton = new JButton("等于");

    public void init() {

        jFrame.setBounds(100, 100, 150, 150);
        jFrame.setLayout(new FlowLayout());
        jFrame.add(jText1);
        jFrame.add(jText2);
        jFrame.add(jText3);
        jText3.setEditable(false);
        jFrame.add(jbutton);
        jbutton.addActionListener(e->jText3.setText("" + (Double.parseDouble(String.valueOf(jText1.getText())) + Double.parseDouble(String.valueOf(jText2.getText())))));

        jFrame.setVisible(true);
    }


    public static void main(String[] args) {
        new Exam02().init();

    }


}