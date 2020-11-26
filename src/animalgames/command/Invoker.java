package animalgames.command;

//调用者（颁奖人）
public class Invoker
{
  private Command command;
  public Invoker(Command command)
  {
      this.command=command;
  }
  public void setCommand(Command command)
  {
      this.command=command;
  }
  public void call()
  {
      System.out.println("主持人宣布：");
      command.execute();
  }
}