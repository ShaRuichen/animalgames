package animalgames.decorator;

public class AnimalDecorator extends Animal {
	protected Animal animal;
	
	public AnimalDecorator(Animal animal) {
		this.animal = animal;
	}
	
	// 踢足球
	@Override
	public void playFootball() {
		animal.playFootball();
	}
}
