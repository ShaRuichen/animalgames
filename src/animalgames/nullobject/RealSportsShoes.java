package animalgames.nullobject;

//��Ч��Ь��
public class RealSportsShoes extends AbstractSportsShoes{
	public RealSportsShoes(String name) {
		System.out.println("���ڷַ�һ˫"+name+"������˶�Ьһ˫");
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