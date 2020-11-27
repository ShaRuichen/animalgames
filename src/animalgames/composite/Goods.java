package animalgames.composite;

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
