package animalgames.command;

public class ConcreteCommandC implements Command
{
	private Animal receiver;
    ConcreteCommandC(Animal r)
    {
        receiver=r;
    }
    public void execute()
    {
    	System.out.println("���Ǽα��䷢ͭ��");
        receiver.action();
    }
}