package animalgames.builder;

import animalgames.Entry;

public class BuilderPatternDemo {
  @Entry(title = "生成比赛赛场信息")
  // 测试函数
  public static void test() {
    MatchinfBuilder Builder = new MatchinfBuilder();

    Matchinf first = Builder.firstmatch();
    System.out.println("First Match");
    first.showItems();

    Matchinf second = Builder.secondmatch();
    System.out.println("\n\nSecond Match");
    second.showItems();
  }
}