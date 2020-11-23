package memento;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class SportsSelection {
    public static void main(String[] args){
        new SelectSports();
    }
}

//客户窗体类
class SelectSports extends JFrame implements ActionListener{
    private static final long serialVersionUID=1L;
    JPanel CenterJP,EastJP;
    JRadioButton Running,HighJump,LongJump,Swimming;    //跑步，跳高，跳远，游泳
    JButton button1,button2;
    String FileName;
    JLabel g;
    You you;
    SportsStack sports;

    SelectSports(){
        super("选择运动项目");
        you=new You();
        sports=new SportsStack();
        this.setBounds(0,0,900,380);
        this.setResizable(false);
        FileName="";                                                                     //待插入图片
        g=new JLabel(new ImageIcon(FileName),JLabel.CENTER);
        CenterJP=new JPanel();
        CenterJP.setLayout(new GridLayout(1,4));
        CenterJP.setBorder(BorderFactory.createTitledBorder("可选运动项目如下："));
        CenterJP.add(g);
        this.add("Center",CenterJP);
        EastJP=new JPanel();
        EastJP.setLayout(new GridLayout(1,1));
        EastJP.setBorder(BorderFactory.createTitledBorder("您选择的项目是："));
        this.add("East",EastJP);
        JPanel SouthJP=new JPanel();
        JLabel info=new JLabel("四项运动，您选哪项？");
        Running=new JRadioButton("跑步",true);
        HighJump=new JRadioButton("跳高");
        LongJump=new JRadioButton("跳远");
        Swimming=new JRadioButton("游泳");
        button1=new JButton("确定");
        button2=new JButton("返回");
        ButtonGroup group=new ButtonGroup();
        group.add(Running);
        group.add(HighJump);
        group.add(LongJump);
        group.add(Swimming);
        SouthJP.add(info);
        SouthJP.add(Running);
        SouthJP.add(HighJump);
        SouthJP.add(LongJump);
        SouthJP.add(Swimming);
        SouthJP.add(button1);
        SouthJP.add(button2);
        button1.addActionListener(this);
        button2.addActionListener(this);
        this.add("South",SouthJP);
        showPicture("空白");
        you.set("空白");
        sports.push(you.createMemento());    //保存状态
    }

    //显示图片
    void showPicture(String name)
    {
        EastJP.removeAll();    //清除面板内容
        EastJP.repaint();    //刷新屏幕
        you.set(name);
        FileName="";                                                                  //待插入图片
        g=new JLabel(new ImageIcon(FileName),JLabel.CENTER);
        EastJP.add(g);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        boolean ok=false;
        if(e.getSource()==button1)
        {
            ok=sports.push(you.createMemento());    //保存状态
            if(ok && Running.isSelected())
            {
                showPicture("跑步");
            }
            else if(ok && HighJump.isSelected())
            {
                showPicture("跳高");
            }
            else if(ok && LongJump.isSelected())
            {
                showPicture("跳远");
            }
            else if(ok && Swimming.isSelected())
            {
                showPicture("游泳");
            }
        }
        else if(e.getSource()==button2)
        {
            you.restoreMemento(sports.pop()); //恢复状态
            showPicture(you.get());
        }
    }
}

//备忘录：运动项目
class Sports {
    private String name;

    public Sports(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

//发起人：您
class You{
    private String SportName;
    public void set(String name)
    {
        SportName=name;
    }
    public String get()
    {
        return SportName;
    }
    public Sports createMemento()
    {
        return new Sports(SportName);
    }
    public void restoreMemento(Sports p)
    {
        set(p.getName());
    }
}

//管理者：项目栈
class SportsStack{
    private Sports sport[];
    private int top;

    SportsStack(){
        sport=new Sports[5];
        top=-1;
    }

    public boolean push(Sports p){
        if(top>=4){
            System.out.println("没有更多选项啦！");
            return false;
        }
        else{
            sport[++top]=p;
            return true;
        }
    }

    public Sports pop(){
        if(top<=0){
            System.out.println("项目栈空了！");
            return sport[0];
        }
        else return sport[top--];
    }
}
