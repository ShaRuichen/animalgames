package animalgames.abstractfactory;

public abstract class AbstractFactory {
  public abstract Fm getFm(String fm);

  public abstract Animal getAnimal(String animal);
}