package state;
import java.util.Scanner;
public class Testdemo {
	public Testdemo() {
		Venue v =new Venue();
		System.out.println("ʾ����");
		System.out.println("������������ܺã�");
		BadWeather badweather = new BadWeather();
		badweather.doAction(v);
		System.out.println("��������������ã�");
		FineWeather fineweather = new FineWeather();
		fineweather.doAction(v);
		Scanner s= new Scanner(System.in);
		System.out.println("��������������ô��,����1��ʾ��������2��ʾ����");
		int w=s.nextInt();
		if(w==1) {
			v.setWeather(fineweather);
		}
		else if(w==0){
			v.setWeather(badweather);
		}
		v.getWeather().doAction(v);
		s.close();
	}
}