package animalgames.state;

public class BadWeather implements Weather {
//��������
	public void doAction (Venue v) {//�رն���
		System.out.println("��������������");
		v.setWeather(this);
		v.closeceiling();
	}
	
	public String toString() {
		return "Bad Weater";
	}

}
