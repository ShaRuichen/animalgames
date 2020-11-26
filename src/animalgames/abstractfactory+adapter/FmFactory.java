public class FmFactory extends AbstractFactory {

  @Override
  public Animal getAnimal(String AnimalType) {
    return null;
  }

  @Override
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