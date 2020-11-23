package animalgames.prototype;

/***
 * 继承Audience的实体类RaceAudience
 */
public class RaceAudience extends Audience{
    public RaceAudience() {
        type = "RaceAudience";  // 比赛项目是赛跑，观众类型是跑步比赛观众

    }


    @Override
    public void draw() {// 接口实现
        System.out.println("Inside Rectangle::draw() methiid.");
    }
}

