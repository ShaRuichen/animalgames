package composite;

import java.util.ArrayList;
public class Score {
    public static void main(String[] args) {
        float s = 0;
        Sport Running, Bicycle, Swimming;
        Goods sp;
        Running = new Sport("马拉松");
        Bicycle = new Sport("自行车");
        Swimming = new Sport("游泳");
        sp = new Goods("游泳", 80);
        Swimming.add(sp);
        sp = new Goods("自行车", 82);
        Bicycle.add(sp);
        Bicycle.add(Swimming);
        sp = new Goods("马拉松", 96);
        Running.add(sp);
        Running.add(Bicycle);
        System.out.println("您铁人三项各项目的得分为：");
        Running.show();
        s = Running.calculation();
        System.out.println("您铁人三项的总分为：" + s + "分");
    }
}

//抽象构件：单项运动
interface Articles {
    public float calculation(); //计算
    public void show();
}

//树叶构件：项目得分
class Goods implements Articles {
    private String name;     //项目名称
    private float unitScore; //单项得分
    public Goods(String name, float unitScore) {
        this.name = name;
        this.unitScore = unitScore;
    }
    public float calculation() {
        return unitScore;
    }
    public void show() {
        System.out.println(name + unitScore + "分");
    }
}

//树枝构件：项目
class Sport implements Articles {
    private String name;     //名字
    private ArrayList<Articles> bags = new ArrayList<Articles>();
    public Sport(String name) {
        this.name = name;
    }
    public void add(Articles c) {
        bags.add(c);
    }
    public void remove(Articles c) {
        bags.remove(c);
    }
    public Articles getChild(int i) {
        return bags.get(i);
    }
    public float calculation() {
        float s = 0;
        for (Object obj : bags) {
            s += ((Articles) obj).calculation();
        }
        return s;
    }
    public void show() {
        for (Object obj : bags) {
            ((Articles) obj).show();
        }
    }
}
