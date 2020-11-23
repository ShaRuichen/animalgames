package archtec;

public class CommandPattern {
}
//调用者（颁奖人）
class Invoker
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
//抽象命令
interface Command
{
    public abstract void execute();
}
//具体命令（引导员）
class ConcreteCommand implements Command
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
class ConcreteCommandB implements Command
{
	private Animal receiver;
    ConcreteCommandB(Animal r)
    {
        receiver=r;
    }
    public void execute()
    {
    	System.out.println("礼仪嘉宾颁发银牌");
        receiver.action();
    }
}
class ConcreteCommandC implements Command
{
	private Animal receiver;
    ConcreteCommandC(Animal r)
    {
        receiver=r;
    }
    public void execute()
    {
    	System.out.println("礼仪嘉宾颁发铜牌");
        receiver.action();
    }
}
