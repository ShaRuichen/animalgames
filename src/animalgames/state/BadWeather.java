package animalgames.state;

public class BadWeather implements Weather {
//坏天气类
	public void doAction (Venue v) {//关闭顶棚
		System.out.println("现在天气不适宜");
		v.setWeather(this);
		v.closeceiling();
	}
	
	public String toString() {
		return "Bad Weater";
	}

}
