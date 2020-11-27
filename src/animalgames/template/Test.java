package animalgames.template;

import animalgames.Entry;

public class Test {
	@Entry(title = "创建新的猫科动物")
    public static void test(){
        Felidae newTiger = new Tiger();
        newTiger.initialize();
        newTiger.meow();
        newTiger.play();
        System.out.println();
        Felidae newCat = new Cat();
        newCat.meow();
        newCat.play();
    }
}
