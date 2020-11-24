package animalgames.abstractfactory;

public class FactoryProducer {
  public static AbstractFactory getFactory(String choice) {
    if (choice.equalsIgnoreCase("ANIMAL")) {
      return new AnimalFactory();
    } else if (choice.equalsIgnoreCase("FM")) {
      return new FmFactory();
    }
    return null;
  }
}