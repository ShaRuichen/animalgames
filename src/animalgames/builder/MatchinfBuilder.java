public class MatchinfBuilder {

  public Matchinf firstmatch() {
    Matchinf a = new Matchinf();
    a.addItem(new firstgym());
    a.addItem(new monday());
    a.addItem(new sunny());
    return a;
  }

  public Matchinf secondmatch() {
    Matchinf a = new Matchinf();
    a.addItem(new secondgym());
    a.addItem(new friday());
    a.addItem(new rainy());
    return a;
  }
}