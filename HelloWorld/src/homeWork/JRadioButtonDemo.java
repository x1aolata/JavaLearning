package homeWork;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;


public class JRadioButtonDemo extends JFrame {


    JRadioButton rb[];

    public JRadioButtonDemo() {
        super("JRadioButton");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new FlowLayout());

        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createEtchedBorder());
        ButtonGroup bg = new ButtonGroup();
        String str[] = {"Red", "Green", "Blue"};
        Color color[] = {Color.RED, Color.GREEN, Color.BLUE};
        rb = new JRadioButton[str.length];

        for (int i = 0; i < rb.length; i++) {
            rb[i] = new JRadioButton(str[i]);
            rb[i].setForeground(color[i]);
            p.add(rb[i]);
            bg.add(rb[i]);
        }
        this.getContentPane().add(p);

        this.pack();
        this.setVisible(true);
    }

    public static void main(String args[]) {
        new JRadioButtonDemo();
    }

}

