package animalgames.state;

public class Venue {
	private Weather weather;//天气对象
	public Venue() {//构造函数
		weather=null;
	}
	public Weather getWeather() {//返回天气状态
		return weather;
	}
	public void setWeather(Weather weather) {//对天气状态进行设置
		this.weather=weather;
	}
	public void openceiling() {//打开顶棚的操作
		System.out.println("场馆顶棚已经打开");
	}
	public void closeceiling() {//关闭场馆顶棚的操作
		System.out.println("场馆的顶棚已经关闭");
	}
}
