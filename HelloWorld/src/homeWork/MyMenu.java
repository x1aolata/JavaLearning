package homeWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyMenu extends JFrame implements ActionListener, MouseListener {

    JMenu jmiNew,jm1,jm2,jm3;
    JMenuItem jmiOpen,jmiSave,jmiExit,jmiPro,jmiClass;
    //JMenuItem jmiNew;
    JMenuBar mb;
    JTextArea ta;
    JPopupMenu pm;
    JMenuItem jmiCopy,jmiPaste,jmiCut;
    JToolBar tb;
    JCheckBox cb1,cb2;
    public MyMenu()
    {
        super("Menu Demo");
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        jm1=new JMenu("文件");
        jm2=new JMenu("编辑");
        jm3=new JMenu("帮助");
        jmiNew=new JMenu("新建");

        mb=new JMenuBar();
        mb.add(jm1);
        mb.add(jm2);
        mb.add(jm3);
        this.setJMenuBar(mb);


        ta=new JTextArea();
        this.getContentPane().add(ta);

        cb1=new JCheckBox("粗体");
        cb2=new JCheckBox("斜体");
        tb=new JToolBar();
        tb.add(cb1);
        tb.add(cb2);
        this.getContentPane().add(tb,"North");
        tb.setFloatable(false);
        cb1.addActionListener(this);
        cb2.addActionListener(this);

        //jmiNew=new JMenuItem("新建");
        jmiOpen=new JMenuItem("打开");
        jmiSave=new JMenuItem("保存");
        jmiExit=new JMenuItem("退出");
        jmiExit.addActionListener(this);
        jmiOpen.addActionListener(this);

        jm1.add(jmiNew);
        jm1.addSeparator();
        jm1.add(jmiOpen);
        jm1.addSeparator();
        jm1.add(jmiSave);
        jm1.addSeparator();
        jm1.add(jmiExit);

        jmiPro=new JMenuItem("工程");
        jmiClass=new JMenuItem("类");
        jmiNew.add(jmiPro);
        jmiNew.addSeparator();
        jmiNew.add(jmiClass);

        jmiCopy=new JMenuItem("复制");
        jmiPaste=new JMenuItem("粘贴");
        jmiCut=new JMenuItem("剪切");
        jmiCopy.addActionListener(this);
        jmiPaste.addActionListener(this);
        jmiCut.addActionListener(this);

        pm=new JPopupMenu();
        pm.add(jmiCopy);
        pm.add(jmiPaste);
        pm.add(jmiCut);

        ta.add(pm);
        ta.addMouseListener(this);


        this.setVisible(true);

    }
    public static void main(String args[])
    {
        new MyMenu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("退出"))
            System.exit(0);
        if(e.getActionCommand().equals("打开"))
        {
            JFileChooser fc=new JFileChooser();
            fc.showOpenDialog(this);
        }
        if(e.getActionCommand().equals("复制"))
        {
            ta.copy();
        }
        if(e.getActionCommand().equals("粘贴"))
        {
            ta.paste();
        }
        if(e.getActionCommand().equals("剪切"))
        {
            ta.cut();
        }
        if(e.getSource() instanceof JCheckBox)
        {
            Font font=ta.getFont();
            int style=font.getStyle();
            if(e.getActionCommand().equals("粗体"))
                style=style^1;
            if(e.getActionCommand().equals("斜体"))
                style=style^2;
            ta.setFont(new Font(font.getFontName(),style,font.getSize()));
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getButton()==3)
            pm.show(ta,e.getX(),e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

