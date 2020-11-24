package bridge;
import java.awt.*;
import javax.swing.*;

public class ClothesSelection
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

//实现化角色：颜色
interface Color
{
    String getColor();
}

//具体实现化角色：黄色
class Yellow implements Color
{
    public String getColor()
    {
        return "yellow";
    }
}

//具体实现化角色：红色
class Red implements Color
{
    public String getColor()
    {
        return "red";
    }
}

//抽象化角色：时装
abstract class Clothes
{
    protected Color color;
    public void setColor(Color color)
    {
        this.color=color;
    }
    public abstract String getName();
}

//扩展抽象化角色：上装
class Shirt extends Clothes
{
    public String getName()
    {
        return color.getColor()+"Shirt";
    }
}

//扩展抽象化角色：下装
class Pants extends Clothes
{
    public String getName()
    {
        return color.getColor()+"Pants";
    }
}
