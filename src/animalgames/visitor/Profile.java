package animalgames.visitor;

/** profile class, informations can be added as class property */
public class Profile implements FelidaeProperty {
    protected String name;
    protected String species; 

    public Profile(){name = "NO_INI"; species = "NO_INI";}
    public Profile(String newName,String newSpecies){name = newName;species = newSpecies;}

    @Override
    public void show(FelidaePropertyVisitor felidaePropertyVisitor){
        felidaePropertyVisitor.visit(this);
    }
}
