package VisitorPattern;

public interface FelidaePropertyVisitor {
    public void visit(Profile profile);
    public void visit(Assignment assignment);
    public void visit(Felidae felidae);
}

