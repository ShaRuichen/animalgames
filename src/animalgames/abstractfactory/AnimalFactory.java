package animalgames.abstractfactory;

public class AnimalFactory extends AbstractFactory {

  @Override
  // 根据AnimalType来创建对应的animal类型
  public Animal getAnimal(String AnimalType) {
    if (AnimalType == null) {
      return null;
    }
    if (AnimalType.equalsIgnoreCase("CAT")) {
      return new cat();
    } else if (AnimalType.equalsIgnoreCase("DOG")) {
      return new dog();
    } else if (AnimalType.equalsIgnoreCase("ELEPHANT")) {
      return new elephant();
    } else if (AnimalType.equalsIgnoreCase("RABBIT")) {
      return new rabbit();
    } else if (AnimalType.equalsIgnoreCase("SNAKE")) {
      return new snake();
    } else if (AnimalType.equalsIgnoreCase("HUMAN")) {
      return new Adapter();
    }
    return null;
  }

  @Override
  // 根据fm来创建动物性别
  public Fm getFm(String fm) {
    return null;
  }
}