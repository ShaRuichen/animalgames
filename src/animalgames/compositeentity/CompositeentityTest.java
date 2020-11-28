package animalgames.compositeentity;

import animalgames.Entry;

import java.util.Scanner;

/***
 * 裁判登记比赛成绩
 */

public class CompositeentityTest {
    @Entry(title = "登记比赛成绩")
    public static void test() {
        Referee referee = new Referee();
        System.out.println("请登记第一场比赛成绩");
        // 第一场比赛
        Scanner first1 = new Scanner(System.in);
        String firstScore1 = first1.next();
        Scanner first2 = new Scanner(System.in);
        String firstScore2 = first2.next();
        referee.setData(firstScore1, firstScore2);
        referee.printData();
        // 第二场比赛
        System.out.println("请登记第二场比赛成绩");
        Scanner second1 = new Scanner(System.in);
        String secondScore1 = second1.next();
        Scanner second2 = new Scanner(System.in);
        String secondScore2 = second2.next();
        referee.setData(secondScore1, secondScore2);
        referee.printData();
    }
}



