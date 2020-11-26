package animalgames.visitor;

import animalgames.Entry;

public class Test {
    public static void test() {
        @Entry(title = "查看某猫科运动员属性")
        FelidaeProperty felidae = new Felidae();
        felidae.show(new FelidaePropertyDisplayVisitor());
    }
}
