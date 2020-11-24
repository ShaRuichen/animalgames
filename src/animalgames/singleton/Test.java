package animalgames.singleton;
//测试
public class Test {
    @Entry(title = "显示名单")
    public static void test() {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        PingpongUmpire object = PingpongUmpire.getInstance();

        //显示消息
        object.showMessage();
    }
}