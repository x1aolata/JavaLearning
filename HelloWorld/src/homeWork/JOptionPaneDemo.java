package homeWork;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionPaneDemo extends JFrame implements ActionListener {


    JButton bt;
    public JOptionPaneDemo()
    {
        super("JOptionDemo");
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        bt=new JButton("选择颜色");
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(bt);
        bt.addActionListener(this);

        int n;
        n=JOptionPane.showConfirmDialog(null,"是否运行程序","提示",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(n==JOptionPane.OK_OPTION)
            this.setVisible(true);
        else
            System.exit(0);

    }
    public static void main(String args[])
    {
        new JOptionPaneDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color color=JColorChooser.showDialog(bt,"颜色选择", Color.RED);
        this.getContentPane().setBackground(color);
    }
}
