package animalgames.bridge;

import javax.swing.*;
import java.awt.*;

public class ClothesSelectionTest
{
    public static void main(String[] args)
    {
        Color color;
        Clothes clothes;
        color=(Color)ReadXML.getObject("color");
        clothes=(Clothes)ReadXML.getObject("clothes");
        clothes.setColor(color);
        String name=clothes.getName();
        show(name);
    }
    public static void show(String name)
    {
        JFrame jf=new JFrame("桥接模式测试");
        Container contentPane=jf.getContentPane();
        JPanel p=new JPanel();
        JLabel l=new JLabel(new ImageIcon(""));                              //待插入图片
        p.setLayout(new GridLayout(1,1));
        p.setBorder(BorderFactory.createTitledBorder("动物选择"));
        p.add(l);
        contentPane.add(p, BorderLayout.CENTER);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
