package animalgames.singleton;
//创建乒乓球裁判
public class PingpongUmpire {
    //创建 PingpongUmpire 的一个对象
    private static PingpongUmpire instance = new PingpongUmpire();
    //让构造函数为 private，这样该类就不会被实例化
    private PingpongUmpire(){}
    //获取唯一可用的对象
    public static PingpongUmpire getInstance(){
        return instance;
    }
    //输出
    public void showMessage(){
        System.out.println("已创建乒乓球裁判");
    }
}
