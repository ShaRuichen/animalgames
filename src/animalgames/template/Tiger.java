package animalgames.template;

/** specified actions for tigers. */
public class Tiger extends Felidae {
    
    @Override
    void meow() {
        System.out.println("MEEOWRR!!(with a roaring tiger style)");
    }

    @Override
    void initialize() {
        System.out.println("A wild tiger appears!");
    }

    @Override
    void run() {
        System.out.println("The tiger is running quickly.");
    }
}
