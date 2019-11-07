package homeWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JTabbedPaneDemo extends JFrame implements ActionListener {

    JTabbedPane tp;
    JButton bt1, bt2, bt3;

    public JTabbedPaneDemo() {
        super("JTabbedPaneDemo");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        tp = new JTabbedPane();

        bt1 = new JButton("第1个选项卡");
        bt1.addActionListener(this);
        tp.addTab("1", bt1);


        bt2 = new JButton("第2个选项卡");
        bt2.addActionListener(this);
        tp.addTab("2", bt2);


        bt3 = new JButton("第3个选项卡");
        bt3.addActionListener(this);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        JTextArea  ta=new JTextArea(40,40);
        jPanel.add(ta,BorderLayout.CENTER);
        jPanel.add(bt3,BorderLayout.SOUTH);

        tp.addTab("3", jPanel);

        this.getContentPane().add(tp);
        this.setVisible(true);

    }

    public static void main(String args[]) {
        new JTabbedPaneDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(bt1.getActionCommand()))
            System.out.println("这是第一个选项卡");
        if (e.getActionCommand().equals(bt2.getActionCommand()))
            System.out.println("这是第二个选项卡");
        if (e.getActionCommand().equals(bt3.getActionCommand()))
            System.out.println("这是第三个选项卡");
    }
}
