package animalgames.flyweight;

/***
 * ʵ�ֽӿڵ�ʵ�峡����
 */
public class PlayingField implements Site {

    private String gameType; // ��������
    public PlayingField(String gameType) {
        this.gameType = gameType;
    }
    @Override
    public void draw() {
        System.out.println("PlayingField: Draw() [gameType:" + gameType);
    }

}
