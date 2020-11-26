package animalgames.composite;

import java.util.ArrayList;

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
