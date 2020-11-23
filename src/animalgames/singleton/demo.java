package Singleton;

public class demo {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        PingpongUmpire object = PingpongUmpire.getInstance();

        //显示消息
        object.showMessage();
    }
}
