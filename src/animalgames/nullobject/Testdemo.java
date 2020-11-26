package animalgames.nullobject;
import java.util.Scanner;
import animalgames.Entry;
public class Testdemo {
	@Entry(title="分发比赛用鞋")
	public static void Testdemo(){
		System.out.println("比赛用鞋的种类有钉鞋,篮球鞋,长跑鞋,沙地用鞋");
		SportsShoesFactory.insert("钉鞋");
		SportsShoesFactory.insert("篮球鞋");
		SportsShoesFactory.insert("长跑鞋");
		SportsShoesFactory.insert("沙地用鞋");
		System.out.println("现在分别分发一双钉鞋和一双篮球鞋种类的运动鞋");
		AbstractSportsShoes a1=SportsShoesFactory.get("钉鞋");
		AbstractSportsShoes a2=SportsShoesFactory.get("篮球鞋");
		
		System.out.println("现在若将钉鞋从比赛用鞋名单中移除，再试图分发钉鞋时有如下结果：");
		SportsShoesFactory.remove("钉鞋");
		AbstractSportsShoes a3=SportsShoesFactory.get("钉鞋");
		
		System.out.println("请输入一个鞋类名称，将其加入比赛用鞋的名单：");
		Scanner s= new Scanner(System.in);
		String name=s.next();
		SportsShoesFactory.insert(name);
		System.out.println("请输入一个鞋类名称，分发该类别的比赛用鞋一双：");
		String name2=s.next();
		AbstractSportsShoes a4=SportsShoesFactory.get(name2);
		
		s.close();
		
		
	}
	
}
