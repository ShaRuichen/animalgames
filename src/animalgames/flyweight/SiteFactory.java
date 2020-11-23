package animalgames.flyweight;

import java.util.HashMap;

/***
 * 创建一个工厂，生成基于给定gameType的场地类的对象
 */
public class SiteFactory {
    private static final HashMap<String, Site> playingFieldMap = new HashMap<>();
    // 创建一个存储playingField的hashmap

    public static Site getPlayingFeild(String gameType) {
        PlayingField playingField = (PlayingField) playingFieldMap.get(gameType);

        if (playingField == null) {
            playingField = new PlayingField(gameType);
            playingFieldMap.put(gameType, playingField);
            System.out.println("Creating playingField of gameType: " + gameType);
        }
        return playingField;
    }
}
