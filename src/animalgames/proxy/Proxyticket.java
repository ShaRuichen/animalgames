package animalgames.proxy;

/**
 * proxy模式，通过Proxyticket代理真正的Ticket
 */
public class Proxyticket implements Ticket {
    private animalgames.proxy.realticket realticket;
    public int num=0;


    @Override
    public void sellticket(){
        realticket.sellticket();
    }
    @Override
    public void checkticket(){
        realticket.checkticket();
    }
}
