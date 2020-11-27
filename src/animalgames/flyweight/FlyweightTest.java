package animalgames.flyweight;


import animalgames.Entry;

public class FlyweightTest {

    private static final String gameTypes[] = { "Race", "Swim", "Jump" };

    @Entry(title = "������������")
    public static void test() {
        for (int i = 0; i < 5; i++) {
            PlayingField playingField = (PlayingField) SiteFactory.getPlayingFeild(getRandomGameType());
            playingField.draw();
        }
    }

    private static String getRandomGameType() {
        // ���ݴ���������gameType
        return gameTypes[(int)(Math.random()*gameTypes.length)];
    }
}
