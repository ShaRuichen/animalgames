package VisitorPattern;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        FelidaeProperty felidae = new Felidae();
        felidae.show(new FelidaePropertyDisplayVisitor());
    }
}
