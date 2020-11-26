import java.util.ArrayList;
import java.util.List;

public class Matchinf {
  private List<Item> items = new ArrayList<Item>();

  public void addItem(Item item) {
    items.add(item);
  }

  public void showItems() {
    System.out.print("Information : ");
    for (Item item : items) {
      System.out.print("\n" + item.name());
    }
  }
}
