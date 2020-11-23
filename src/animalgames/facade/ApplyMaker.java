package FacadePattern;

public class ApplyMaker {
    private Apply running;
    private Apply jumping;

    public ApplyMaker(){
        running = new RunningApply();
        jumping = new JumpingApply();
    }

    public void addRunner(){
        running.addAnimal();
    }

    public void addJumper(){
        jumping.addAnimal();
    }
}
