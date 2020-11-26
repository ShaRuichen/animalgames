package animalgames.template;

import animalgames.Entry;

public class Test {
    public static void test(){
        @Entry(title = "创建新的猫科动物")
        Felidae newTiger = new Tiger();
        newTiger.initialize();
        newTiger.meow();
        newTiger.play();
        System.out.println();
        Felidae newCat = new Cat();
        newCat.meow();
        newCat.play();
}
