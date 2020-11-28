package animalgames.template;

/** specified actions for cats. */
public class Cat extends Felidae {
    @Override
    void initialize(){
        System.out.println("A cute cat appears!");
    }

    @Override
    void meow(){
        System.out.println("Meow~(with a moe cat style).");
    }

    @Override
    void run(){
        System.out.println("A cute cat is running~.");
    }
}
