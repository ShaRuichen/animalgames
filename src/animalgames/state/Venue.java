package animalgames.state;

public class Venue {
	private Weather weather;//��������
	public Venue() {//���캯��
		weather=null;
	}
	public Weather getWeather() {//��������״̬
		return weather;
	}
	public void setWeather(Weather weather) {//������״̬��������
		this.weather=weather;
	}
	public void openceiling() {//�򿪶���Ĳ���
		System.out.println("���ݶ����Ѿ���");
	}
	public void closeceiling() {//�رճ��ݶ���Ĳ���
		System.out.println("���ݵĶ����Ѿ��ر�");
	}
}
