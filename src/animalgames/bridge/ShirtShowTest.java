package animalgames.bridge;

//测试函数
public class ShirtShowTest {
    public static void main(String[] args) {
        Show redShirt = new Shirt(new RedShirt());
        Show greenShirt = new Shirt(new GreenShirt());

        redShirt.select();
        greenShirt.select();
    }
}
