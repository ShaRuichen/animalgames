package animalgames.visitor;

/** profile class, informations can be added as class property */
public class Profile implements FelidaeProperty {
    @Override
    public void show(FelidaePropertyVisitor felidaePropertyVisitor){
        felidaePropertyVisitor.visit(this);
    }
}
