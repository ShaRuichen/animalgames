package animalgames.composite;

import java.util.ArrayList;
import java.util.List;

public class Athlete {
    private String name;
    private String dept;
    private int number;
    private List<Athlete> subordinates;

    //构造函数
    public Athlete(String name, String dept, int num) {
        this.name = name;
        this.dept = dept;
        this.number = num;
        subordinates = new ArrayList<Athlete>();
    }

    public void add(Athlete e) {
        subordinates.add(e);
    }//增添运动员

    public void remove(Athlete e) {
        subordinates.remove(e);
    }//移动运动员

    public List<Athlete> getSubordinates(){
        return subordinates;
    }//运动员名单

    public String toString(){
        return ("运动员 :[ 名字 : "+ name
                +", 职位 : "+ dept + ", 编号 :"
                + number +" ]");
    }//输出
}
