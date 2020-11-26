package animalgames.facade;

public class ApplyMaker {
    private Apply running;
    private Apply jumping;

    /* the apply-making interface for guest users */
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
