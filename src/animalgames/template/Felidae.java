package TemplatePattern;

public abstract class Felidae {
    abstract void initialize();
    abstract void meow();
    abstract void run();

    public final void action(){

        initialize();

        meow();

        run();
    }

    public void play(){
        System.out.println("A Felidae joins the Game.");
    }
}