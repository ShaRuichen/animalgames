package null_object;


public class RealSportsShoes extends AbstractSportsShoes{
	public RealSportsShoes(String name) {
		System.out.println("现在分发一双"+name+"种类的运动鞋一双");
		this.type=name;
	}
	
	@Override
	public String gettype() {
		return type;
	}
	
	@Override
	public boolean isNil() {
		return false;
	}
	
}