package animalgames.decorator;

public class AnimalDecorator extends Animal {
	protected Animal animal;
	
	public AnimalDecorator(Animal animal) {
		this.animal = animal;
	}
	
	@Override
	public void playFootball() {
		animal.playFootball();
	}
}
