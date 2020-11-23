package animalgames.flyweight;

/***
 * 实现接口的实体场地类
 */
public class PlayingField implements Site {

    private String gameType; // 场地类型
    public PlayingField(String gameType) {
        this.gameType = gameType;
    }
    @Override
    public void draw() {
        System.out.println("PlayingField: Draw() [gameType:" + gameType);
    }

}
