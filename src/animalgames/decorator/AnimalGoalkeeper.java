package animalgames.decorator;

public class AnimalGoalkeeper extends AnimalDecorator {
	public AnimalGoalkeeper(Animal animal) {
		super(animal);
	}
	
	@Override
	public void playFootball() {
		animal.playFootball();
		System.out.println("The goalkeeper animal play footbal with hands.");
	}
}
