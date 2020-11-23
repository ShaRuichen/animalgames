package FacadePattern;

public class JumpingApply implements Apply {
    @Override
    public void addAnimal(){
        System.out.println("Jumping Animal welcomes a new challenger!");
    }

    @Override
    public void removeAnimal(){
        System.out.println("An animal has quit the jumping!");
    }
}
