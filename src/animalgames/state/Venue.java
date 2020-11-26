package state;

public class Venue {
	private Weather weather;
	public Venue() {
		weather=null;
	}
	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather=weather;
	}
	public void openceiling() {
		System.out.println("场馆顶棚已经打开");
	}
	public void closeceiling() {
		System.out.println("场馆的顶棚已经关闭");
	}
}
