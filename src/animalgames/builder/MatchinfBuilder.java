package animalgames.builder;

public class MatchinfBuilder {

  // 生成第一个比赛
  public Matchinf firstmatch() {
    Matchinf a = new Matchinf();
    a.addItem(new firstgym());
    a.addItem(new monday());
    a.addItem(new sunny());
    return a;
  }

  // 生成第二个比赛
  public Matchinf secondmatch() {
    Matchinf a = new Matchinf();
    a.addItem(new secondgym());
    a.addItem(new friday());
    a.addItem(new rainy());
    return a;
  }
}