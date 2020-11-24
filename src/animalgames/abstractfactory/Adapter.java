package animalgames.abstractfactory;

class Adapter extends HUMAN implements Animal {

  @Override
  // 适配函数
  public void draw() {
    this.Output();
  }
}