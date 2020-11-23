package state;

public class BadWeather implements Weather {

	public void doAction (Venue v) {
		System.out.println("现在天气不适宜");
		v.setWeather(this);
		v.closeceiling();
	}
	
	public String toString() {
		return "Bad Weater";
	}

}
