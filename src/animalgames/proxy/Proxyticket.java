

public class Proxyticket implements Ticket {
    public int num=0;
    @Override
    public void sellticket(){
        System.out.println("购票成功");
        num++;
    }
    @Override
    public void checkticket(){
        System.out.println("当前已售票:" + num);
    }
}
