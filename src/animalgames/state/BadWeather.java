package state;

public class BadWeather implements Weather {

	public void doAction (Venue v) {
		System.out.println("��������������");
		v.setWeather(this);
		v.closeceiling();
	}
	
	public String toString() {
		return "Bad Weater";
	}

}
