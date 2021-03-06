package animalgames.memento;

import animalgames.Entry;
import java.util.Scanner;

//测试函数
public class SelectionHistoryTest {
	@Entry(title = "展示观赛记录")
    public static void test(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("您已成功选择观赛项目: 田径");
        originator.setState("您已成功选择观赛项目: 跳高");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("您已成功选择观赛项目: 跳远");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("您已成功选择观赛项目: 游泳");

        System.out.println("您现在的观赛信息为: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("最近两次购票记录1: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("最近两次购票记录2: " + originator.getState());
	    
	Scanner s = new Scanner(System.in);
        System.out.println("请输入您想选择的观赛项目: ");
        String object=s.next();
        System.out.println("您已成功选择观赛项目: "+object);
        System.out.println("您现在的观赛信息为: 您已成功选择观赛项目: "+object);
    }
}
