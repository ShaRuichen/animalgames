package animalgames.abstractfactory;

class Adapter extends HUMAN implements Animal {

  @Override
  public void draw() {
    this.Output();
  }
}