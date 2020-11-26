package animalgames.facade;

public class JumpingApply implements Apply {

    /* add a new athlete to a jumping competition */
    @Override
    public void addAnimal(){
        System.out.println("Jumping Animal welcomes a new challenger!");
    }

    /* remove athlete, more actions maybe needed */
    @Override
    public void removeAnimal(){
        System.out.println("An animal has quit the jumping!");
    }
}
