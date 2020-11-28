package animalgames.builder;

import java.util.Scanner;
import animalgames.Entry;

public class BuilderPatternDemo {
  @Entry(title = "生成比赛赛场信息")
  // 测试函数
  public static void test() {
    MatchinfBuilder Builder = new MatchinfBuilder();
    Scanner input = new Scanner(System.in);
    System.out.println("请选择：1.随机产生一个比赛背景  2.退出");
    int option = input.nextInt();
    while (true) {
      if (option == 1) {
        Matchinf first = Builder.firstmatch();
        first.showItems();
      } else if (option == 2) {
        break;
      } else {
        System.out.println("请输入正确选项");
      }
      System.out.println("请选择：1.随机产生一个比赛背景  2.退出");
      option = input.nextInt();
    }
  }
}
