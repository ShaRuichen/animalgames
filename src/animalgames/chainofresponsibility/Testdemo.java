package animalgames.chainofresponsibility;
import java.util.Scanner;

import animalgames.Entry;
public class Testdemo {
	@Entry (title="��ʾ����ʾ��֪ͨ")
	public static void Testdemo() {
		AbstractLogger l1 = new AudienceLogger(AbstractLogger.ALL);
	      AbstractLogger l2= new AthleteLogger(AbstractLogger.ATHLETE);
	      AbstractLogger l3= new JudgmentLogger(AbstractLogger.JUDGMENT);
	 
	      l1.setNextLogger(l2);
	      l2.setNextLogger(l3);
	      System.out.println("������֪ͨ�����ݣ�");
	      Scanner s= new Scanner(System.in);
	      String imf=s.next();
	      System.out.println("����������Ϣʲô��ݵ��˿ɼ���1:�����пɼ�	2�����к��˶�Ա�ɼ�	3�������˿ɼ����������ڣ�");
	      int i=s.nextInt();
	      l1.logMessage(i, imf);
	      
	      s.close();
	}
}