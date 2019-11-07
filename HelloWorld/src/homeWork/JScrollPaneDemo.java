package homeWork;

import javax.swing.*;
import java.awt.*;

public class JScrollPaneDemo extends JFrame{

    JScrollPane sp;
    JTextArea ta;
    public JScrollPaneDemo()
    {
        super("JScrollPaneDemo");
        this.setSize(200,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // this.setLayout((new FlowLayout()));
        sp=new JScrollPane();
        ta=new JTextArea(40,40);
        sp.getViewport().add(ta);
        this.getContentPane().add(sp);
        this.setVisible(true);
    }

    public static void main(String args[])
    {
        new JScrollPaneDemo();
    }
}
