package animalgames.flyweight;

import java.util.HashMap;

/***
 * ����һ�����������ɻ��ڸ���gameType�ĳ�����Ķ���
 */
public class SiteFactory {
    private static final HashMap<String, Site> playingFieldMap = new HashMap<>();
    // ����һ���洢playingField��hashmap

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
