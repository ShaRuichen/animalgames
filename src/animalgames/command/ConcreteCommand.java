package animalgames.command;

//具体命令（引导员）
public class ConcreteCommand implements Command
{
  private Animal receiver;
  ConcreteCommand(Animal r)
  {
      receiver=r;
  }
  public void execute()
  {
  	System.out.println("礼仪嘉宾颁发金牌");
      receiver.action();
  }
}
