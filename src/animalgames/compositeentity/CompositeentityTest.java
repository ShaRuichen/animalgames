package animalgames.compositeentity;

import animalgames.Entry;

/***
 * 裁判登记比赛成绩
 */

public class CompositeentityTest {
    @Entry(title = "登记比赛成绩")
    public static void test() {
        Referee referee = new Referee();
        // 第一场比赛
        referee.setData("Score1", "Score2");
        referee.printData();
        // 第二场比赛
        referee.setData("Score1", "Score2");
        referee.printData();
    }
}



