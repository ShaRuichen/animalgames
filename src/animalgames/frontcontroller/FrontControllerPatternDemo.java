package animalgames.frontcontroller;
import animalgames.Entry;

//使用FrontController来演示前端控制器设计模式
public class FrontControllerPatternDemo {
    @Entry(title = "view")
    public static void test() {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("ANIMALS");
    }
}