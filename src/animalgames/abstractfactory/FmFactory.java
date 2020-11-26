package animalgames.abstractfactory;

public class FmFactory extends AbstractFactory {

  @Override
  // 根据AnimalType来创建对应的animal
  public Animal getAnimal(String AnimalType) {
    return null;
  }

  @Override
  // 根据fm来创建动物性别
  public Fm getFm(String Fm) {
    if (Fm == null) {
      return null;
    }
    if (Fm.equalsIgnoreCase("MALE")) {
      return new male();
    } else if (Fm.equalsIgnoreCase("FEMALE")) {
      return new female();
    }
    return null;
  }
}