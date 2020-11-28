package animalgames.visitor;

/** an extension of property, to tell which competition this felidae joins, can be added as class-property. */
public class Assignment implements FelidaeProperty {
    protected String assignedComp;

    public Assignment(){assignedComp = "NO_INI";}
    public Assignment(String asgi){assignedComp = asgi;}

    @Override
    public void show(FelidaePropertyVisitor felidaePropertyVisitor){
        felidaePropertyVisitor.visit(this);
    }
}
