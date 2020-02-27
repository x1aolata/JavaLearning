package swingTest;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Test extends JFrame implements ActionListener {
    JTextField j1, j2, j3;

    public Test() {
        super("加法计算器");
        this.setLayout(new FlowLayout());
        this.setSize(150, 150);
        j1 = new JTextField(10);
        j2 = new JTextField(10);
        j3 = new JTextField(10);
//        j3.enable(false);
        j3.setEditable(false);
        JButton jb = new JButton("plus");
//        jb.setOnclickListener(this);
        jb.addActionListener(this);

        this.add(j1);
        this.add(j2);
        this.add(j3);
        this.add(jb);
        this.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        try {
            double x = Double.parseDouble(j1.getText());
            double y = Double.parseDouble(j2.getText());
            j3.setText(String.valueOf(x + y));
        } catch (Exception ex) {

        }
    }

    public static void main(String[] args) {
        new Test();

    }

}

