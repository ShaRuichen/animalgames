package TemplatePattern;

public class Tiger extends Felidae {
    
    @Override
    void meow() {
        System.out.println("MEEOW!!(with tiger style)");
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
