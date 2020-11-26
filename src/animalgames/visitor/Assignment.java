package animalgames.visitor;

/** an extension of property, to tell which competition this felidae joins, can be added as class-property. */
public class Assignment implements FelidaeProperty {
    @Override
    public void show(FelidaePropertyVisitor felidaePropertyVisitor){
        felidaePropertyVisitor.visit(this);
    }
}
