package animalgames.prototype;

/***
 * 继承Audience的实体类SwimAudience
 */
public class SwimAudience extends Audience {
    public SwimAudience() {
        type = "SwimAudience";  // 比赛项目是游泳，观众类型是游泳比赛观众

    }

    @Override
    public void draw() {// 接口实现
        System.out.println("Inside Rectangle::draw() methiid.");
    }
}
