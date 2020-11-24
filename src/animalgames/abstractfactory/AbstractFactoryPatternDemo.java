package animalgames.abstractfactory;

import java.util.Scanner;
import animalgames.Entry;

public class AbstractFactoryPatternDemo {
  @Entry(title = "创建裁判员")
  public static void test() {

    // 获取动物类型工厂
    AbstractFactory AnimalFactory = FactoryProducer.getFactory("ANIMAL");

    // 获取动物类型为 cat 的对象
    Animal Animal1 = AnimalFactory.getAnimal("CAT");
    Animal Animal2 = AnimalFactory.getAnimal("DOG");
    Animal Animal3 = AnimalFactory.getAnimal("ELEPHANT");
    Animal Animal4 = AnimalFactory.getAnimal("RABBIT");
    Animal Animal5 = AnimalFactory.getAnimal("SNAKE");
    Animal Animal6 = AnimalFactory.getAnimal("HUMAN");

    // 获取性别工厂
    AbstractFactory fmFactory = FactoryProducer.getFactory("fm");

    // 获取颜色为 Male 的对象
    Fm fm1 = fmFactory.getFm("MALE");
    Fm fm2 = fmFactory.getFm("FEMALE");
    System.out.println("All referee:cat,dog,elephant,rabbit,snake,human. input CAT to build cat.");
    Scanner input = new Scanner(System.in);
    String str = input.next();
    // 输出结果
    if (str.equalsIgnoreCase("CAT")) {
      fm1.fill();
      Animal1.draw();
    } else if (str.equalsIgnoreCase("DOG")) {
      fm2.fill();
      Animal2.draw();
    } else if (str.equalsIgnoreCase("ELEPHANT")) {
      fm1.fill();
      Animal3.draw();
    } else if (str.equalsIgnoreCase("RABBIT")) {
      fm2.fill();
      Animal4.draw();
    } else if (str.equalsIgnoreCase("SNAKE")) {
      fm1.fill();
      Animal5.draw();
    } else if (str.equalsIgnoreCase("HUMAN")) {
      fm2.fill();
      Animal6.draw();
    }
  }
}