package state;

public class FineWeather implements Weather {
	public void doAction(Venue v) {
		System.out.println("现在天气很好");
		v.setWeather(this);
		v.openceiling();
	}
	
	public String toString(){
	      return "Fine Weather";
	}
	
}
