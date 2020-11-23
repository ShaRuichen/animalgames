package VisitorPattern;

public class Profile implements FelidaeProperty {
    @Override
    public void show(FelidaePropertyVisitor felidaePropertyVisitor){
        felidaePropertyVisitor.visit(this);
    }
}
