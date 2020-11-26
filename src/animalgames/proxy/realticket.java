package animalgames.proxy;

/**
 * 对应的真正的售票的对应的实现类
 */
public class realticket implements Ticket {

    private int num = 0;

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
