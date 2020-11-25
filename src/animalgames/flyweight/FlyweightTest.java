package animalgames.flyweight;


import animalgames.Entry;

public class FlyweightTest {

    private static final String gameTypes[] = { "Race", "Swim", "Jump" };

    @Entry(title = "创建比赛场地")
    public static void test() {
        for (int i = 0; i < 5; i++) {
            PlayingField playingField = (PlayingField) SiteFactory.getPlayingFeild(getRandomGameType());
            playingField.draw();
        }
    }

    private static String getRandomGameType() {
        // 根据创建比赛的gameType
        // gameId：gameType存储在工厂中的编号
        return gameTypes[gameId];
    }
}
