package animalgames.state;

public class FineWeather implements Weather {
	//好天气类
	public void doAction(Venue v) {//打开顶棚
		System.out.println("现在天气很好");
		v.setWeather(this);
		v.openceiling();
	}
	
	public String toString(){
	      return "Fine Weather";
	}
	
}
