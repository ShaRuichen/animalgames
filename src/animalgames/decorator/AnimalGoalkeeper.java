package animalgames.decorator;

public class AnimalGoalkeeper extends AnimalDecorator {
	public AnimalGoalkeeper(Animal animal) {
		super(animal);
	}
	
	// 守门员踢足球
	@Override
	public void playFootball() {
		animal.playFootball();
		System.out.println("The goalkeeper animal play footbal with hands.");
	}
}
