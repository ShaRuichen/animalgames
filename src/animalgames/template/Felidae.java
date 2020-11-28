package animalgames.template;

public abstract class Felidae {
    abstract void initialize();
    abstract void meow();
    abstract void run();

    public final void action(){

        /**actions when new felidae is created */
        initialize();

        /** the felidae meows. */
        meow();

        /** the felidae runs. */
        run();

        /** can add more actions in the future e.g jumping, waving hands, etc. */
    }

    /** specified actions that all felidaes can do. */
    public void play(){
        System.out.println("A Felidae joins the Game.");
    }
}