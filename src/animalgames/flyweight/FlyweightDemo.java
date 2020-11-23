package animalgames.flyweight;

public class FlyweightDemo {
    private static final String gameTypes[] = { "Race", "Swim", "Jump" };

    public static void main(String[] args) {
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
