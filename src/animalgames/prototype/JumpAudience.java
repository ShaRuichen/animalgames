package animalgames.prototype;

/***
 * 继承Audience的实体类JumpAudience
 */
public class JumpAudience extends Audience {
    public JumpAudience() {
        type = "JumpAudience";  // 比赛项目是跳高，观众类型是跳高比赛观众

    }

    @Override
    public void draw() {// 接口实现
        System.out.println("Inside Rectangle::draw() methiid.");
    }
}
