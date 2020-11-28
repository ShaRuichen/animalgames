package animalgames.builder;

import java.util.Random;

public class MatchinfBuilder {

  public Matchinf firstmatch() {
    Matchinf a = new Matchinf();
    Random rand1 = new Random();
    if (rand1.nextInt(2) == 0) {
      a.addItem(new firstgym());
    } else {
      a.addItem(new secondgym());
    }
    Random rand2 = new Random();
    if (rand2.nextInt(2) == 0) {
      a.addItem(new monday());
    } else {
      a.addItem(new friday());
    }
    Random rand3 = new Random();
    if (rand3.nextInt(3) == 0) {
      a.addItem(new sunny());
    } else {
      a.addItem(new rainy());
    }
    return a;
  }
}