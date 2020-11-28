package animalgames.bridge;

public class ShirtShowTest {
    public static void main(String[] args) {
        Show redShirt = new Shirt(new RedShirt());
        Show greenShirt = new Shirt(new GreenShirt());

        redShirt.select();
        greenShirt.select();
    }
}
