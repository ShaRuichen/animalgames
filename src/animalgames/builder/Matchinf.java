package animalgames.builder;

import java.util.ArrayList;
import java.util.List;

public class Matchinf {
  private List<Item> items = new ArrayList<Item>();

  // 将需要的赛场信息加入队列中
  public void addItem(Item item) {
    items.add(item);
  }

  // 显示赛场信息队列
  public void showItems() {
    System.out.print("Information : ");
    for (Item item : items) {
      System.out.print("\n" + item.name());
    }
  }
}
