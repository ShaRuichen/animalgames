package animalgames.visitor;

import animalgames.Entry;

public class Test {
	@Entry(title = "查看某猫科运动员属性")
    public static void test() {
        FelidaeProperty felidae = new Felidae();
        felidae.show(new FelidaePropertyDisplayVisitor());
    }
}
