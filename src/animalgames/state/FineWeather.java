package animalgames.state;

public class FineWeather implements Weather {
	//��������
	public void doAction(Venue v) {//�򿪶���
		System.out.println("���������ܺ�");
		v.setWeather(this);
		v.openceiling();
	}
	
	public String toString(){
	      return "Fine Weather";
	}
	
}
