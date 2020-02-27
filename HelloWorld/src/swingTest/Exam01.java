package swingTest;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Exam01 {

    private JFrame jFrame = new JFrame("Exam01");
    private JLabel jLabel1 = new JLabel("请输入一个字符串，输入完毕后按回车");
    private JLabel jLabel2 = new JLabel("输入的信息是：");
    private JTextField jTextFieldInput = new JTextField(20);
    private JTextField jTextFieldOuiput = new JTextField(20);
    private JButton ReInput = new JButton("重新输入");
    private JButton Close = new JButton("退出");

    public void init() {
        jFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
        jFrame.setBounds(100, 100, 300, 200);

        jFrame.add(jLabel1);
        jFrame.add(jTextFieldInput);

        jTextFieldInput.addActionListener(e -> {
            jTextFieldOuiput.setText(jTextFieldInput.getText());
            jTextFieldInput.setText("");

        });
        jFrame.add(jLabel2);
        jFrame.add(jTextFieldOuiput);

        Panel panel = new Panel();
        panel.add(ReInput);
        ReInput.addActionListener(e -> jTextFieldOuiput.setText(""));
        panel.add(Close);
        Close.addActionListener(e -> System.exit(0));
        jFrame.add(panel);

//        jFrame.pack();
        jFrame.setVisible(true);
//        jFrame.getContentPane()
    }

    public static void main(String[] args) {
        new Exam01().init();
    }


}
