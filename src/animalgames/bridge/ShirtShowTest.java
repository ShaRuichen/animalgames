package animalgames.bridge;

import animalgames.Entry;

//测试函数
public class ShirtShowTest {
	@Entry(title = "展示可选时装")
    public static void main(String[] args) {
        Show redShirt = new Shirt(new RedShirt());
        Show greenShirt = new Shirt(new GreenShirt());

        redShirt.select();
        greenShirt.select();
    }
}
