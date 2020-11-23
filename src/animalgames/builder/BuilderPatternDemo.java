public class BuilderPatternDemo {
  public static void main(String[] args) {
    MatchinfBuilder Builder = new MatchinfBuilder();

    Matchinf first = Builder.firstmatch();
    System.out.println("First Match");
    first.showItems();

    Matchinf second = Builder.secondmatch();
    System.out.println("\n\nSecond Match");
    second.showItems();
  }
}