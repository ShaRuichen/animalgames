package VisitorPattern;

public class Assignment implements FelidaeProperty {
    @Override
    public void show(FelidaePropertyVisitor felidaePropertyVisitor){
        felidaePropertyVisitor.visit(this);
    }
}
