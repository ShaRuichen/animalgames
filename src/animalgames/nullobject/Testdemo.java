package animalgames.nullobject;
import java.util.Scanner;
import animalgames.Entry;
public class Testdemo {
	@Entry(title="�ַ�������Ь")
	public static void Testdemo(){
		System.out.println("������Ь�������ж�Ь,����Ь,����Ь,ɳ����Ь");
		SportsShoesFactory.insert("��Ь");
		SportsShoesFactory.insert("����Ь");
		SportsShoesFactory.insert("����Ь");
		SportsShoesFactory.insert("ɳ����Ь");
		System.out.println("���ڷֱ�ַ�һ˫��Ь��һ˫����Ь������˶�Ь");
		AbstractSportsShoes a1=SportsShoesFactory.get("��Ь");
		AbstractSportsShoes a2=SportsShoesFactory.get("����Ь");
		
		System.out.println("����������Ь�ӱ�����Ь�������Ƴ�������ͼ�ַ���Ьʱ�����½����");
		SportsShoesFactory.remove("��Ь");
		AbstractSportsShoes a3=SportsShoesFactory.get("��Ь");
		
		System.out.println("������һ��Ь�����ƣ�������������Ь��������");
		Scanner s= new Scanner(System.in);
		String name=s.next();
		SportsShoesFactory.insert(name);
		System.out.println("������һ��Ь�����ƣ��ַ������ı�����Ьһ˫��");
		String name2=s.next();
		AbstractSportsShoes a4=SportsShoesFactory.get(name2);
		
		s.close();
		
		
	}
	
}
