package animalgames.visitor;

public class Felidae implements FelidaeProperty {
    FelidaeProperty[] props;

    public Felidae(){
        props = new FelidaeProperty[] {new Profile(), new Assignment()};
    }

    public Felidae(String name, String species, String assign){
        props = new FelidaeProperty[] {new Profile(name,species), new Assignment(assign)};
    }

    @Override
    public void show(FelidaePropertyVisitor felidaePropertyVisitor){
        felidaePropertyVisitor.visit(this);
        for (int i = 0; i < props.length; i++){
            props[i].show(felidaePropertyVisitor);
        }
    }
}
