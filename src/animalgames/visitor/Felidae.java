package VisitorPattern;

public class Felidae implements FelidaeProperty {
    FelidaeProperty[] props;

    public Felidae(){
        props = new FelidaeProperty[] {new Profile(), new Assignment()};
    }

    @Override
    public void show(FelidaePropertyVisitor felidaePropertyVisitor){
        for (int i = 0; i < props.length; i++){
            props[i].show(felidaePropertyVisitor);
        }
        felidaePropertyVisitor.visit(this);
    }
}
