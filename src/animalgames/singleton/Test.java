package animalgames.singleton;

import animalgames.Entry;

//测试
public class Test {
    @Entry(title = "新建足球")
    public static void test() {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        football object = football.getInstance();

        //显示消息
        object.showMessage();
    }
}
