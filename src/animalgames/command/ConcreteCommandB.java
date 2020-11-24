package animalgames.command;

public class ConcreteCommandB implements Command
{
	private Animal receiver;
    ConcreteCommandB(Animal r)
    {
        receiver=r;
    }
    public void execute()
    {
    	System.out.println("ÀñÒÇ¼Î±ö°ä·¢ÒøÅÆ");
        receiver.action();
    }
}