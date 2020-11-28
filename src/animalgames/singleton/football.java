package animalgames.singleton;
//创建乒乓球裁判
public class football {
    //创建 football 的一个对象
    private static football instance = new football();
    //让构造函数为 private，这样该类就不会被实例化
    private football(){}
    //获取唯一可用的对象
    public static football getInstance(){
        return instance;
    }
    //输出
    public void showMessage(){
        System.out.println("已新建一个足球");
    }
}
