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
		System.out.println("���ݶ����Ѿ���");
	}
	public void closeceiling() {
		System.out.println("���ݵĶ����Ѿ��ر�");
	}
}
