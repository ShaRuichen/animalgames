package animalgames.command;

//�����������Ա��
public class ConcreteCommand implements Command
{
  private Animal receiver;
  ConcreteCommand(Animal r)
  {
      receiver=r;
  }
  public void execute()
  {
  	System.out.println("���Ǽα��䷢����");
      receiver.action();
  }
}
