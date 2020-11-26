package null_object;


public class NullAnimal extends AbstractAnimal {
	@Override
	public String getBreed() {
		return "Not Available in Animal Database";
	}
	
	@Override
	public boolean isNil() {
		return true;
	}
	
}
