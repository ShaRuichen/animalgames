package animalgames.abstractfactory;

public class FactoryProducer {
  // 选择对应工厂来完成创建
  public static AbstractFactory getFactory(String choice) {
    if (choice.equalsIgnoreCase("ANIMAL")) {
      return new AnimalFactory();
    } else if (choice.equalsIgnoreCase("FM")) {
      return new FmFactory();
    }
    return null;
  }
}