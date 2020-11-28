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
        System.out.println("Name: " + profile.name);
        System.out.println("Species: " + profile.species);
    }

    @Override
    public void visit(Assignment assignment){
        System.out.println("Displaying assignment.");
        System.out.println("It's assigned for: " + assignment.assignedComp);
    }
}
