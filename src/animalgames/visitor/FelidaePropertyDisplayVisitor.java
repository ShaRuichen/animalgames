package animalgames.visitor;

/** a visitor which visits the property class interface and displays a visible feedback. */
public class FelidaePropertyDisplayVisitor implements FelidaePropertyVisitor{
    @Override
    public void visit(Felidae felidae){
        System.out.println("Displaying felidae overall properties.");
    }

    @Override
    public void visit(Profile profile){
        System.out.println("Displaying profile.");
    }

    @Override
    public void visit(Assignment assignment){
        System.out.println("Displaying assignment.");
    }
}
