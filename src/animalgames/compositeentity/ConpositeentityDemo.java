package animalgames.compositeentity;

/***
 * 裁判登记比赛成绩
 */
public class ConpositeentityDemo {
    public static void main(String[] args) {
        Referee referee = new Referee();
        // 第一场比赛
        referee.setData("Score1", "Score2");
        referee.printData();
        // 第二场比赛
        referee.setData("Score1", "Score2");
        referee.printData();
    }
}
