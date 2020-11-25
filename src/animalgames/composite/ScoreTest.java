package animalgames.composite;

public class ScoreTest {
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
