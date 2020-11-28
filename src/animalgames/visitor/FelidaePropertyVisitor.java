package animalgames.visitor;

/** abstract visitor class to define all methods that visitors can do.*/
public interface FelidaePropertyVisitor {
    public void visit(Profile profile);
    public void visit(Assignment assignment);
    public void visit(Felidae felidae);
}

