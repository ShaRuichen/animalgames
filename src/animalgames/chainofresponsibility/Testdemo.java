package animalgames.chainofresponsibility;
import java.util.Scanner;

import animalgames.Entry;
public class Testdemo {
	@Entry (title="告示牌显示短通知")
	public static void Testdemo() {
		AbstractLogger l1 = new AudienceLogger(AbstractLogger.ALL);
	      AbstractLogger l2= new AthleteLogger(AbstractLogger.ATHLETE);
	      AbstractLogger l3= new JudgmentLogger(AbstractLogger.JUDGMENT);
	 
	      l1.setNextLogger(l2);
	      l2.setNextLogger(l3);
	      System.out.println("请输入通知的内容：");
	      Scanner s= new Scanner(System.in);
	      String imf=s.next();
	      System.out.println("请问这条消息什么身份的人可见：1:仅裁判可见	2：裁判和运动员可见	3：所有人可见（包括观众）");
	      int i=s.nextInt();
	      l1.logMessage(i, imf);
	      
	      s.close();
	}
}