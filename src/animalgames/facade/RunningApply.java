package FacadePattern;

public class RunningApply implements Apply {
    @Override
    public void addAnimal(){
        System.out.println("New Animal is added as a running athlete.");
    }

    @Override
    public void removeAnimal(){
        System.out.println("An Animal is removed from athlete list.");
    }
}
