package state;
import java.util.Scanner;
public class Testdemo {
	public Testdemo() {
		Venue v =new Venue();
		System.out.println("示例：");
		System.out.println("如果现在天气很好：");
		BadWeather badweather = new BadWeather();
		badweather.doAction(v);
		System.out.println("如果现在天气不好：");
		FineWeather fineweather = new FineWeather();
		fineweather.doAction(v);
		Scanner s= new Scanner(System.in);
		System.out.println("请问现在天气怎么样,输入1表示不错，输入2表示不好");
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