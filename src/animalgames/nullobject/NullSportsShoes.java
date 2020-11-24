package null_object;


public class NullSportsShoes extends AbstractSportsShoes {
	@Override
	public String gettype() {
		return "这双鞋的种类不符和比赛规划";
	}
	
	@Override
	public boolean isNil() {
		return true;
	}
	
}
