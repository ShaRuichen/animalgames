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
        // ���ݴ���������gameType
        // gameId��gameType�洢�ڹ����еı��
        return gameTypes[gameId];
    }
}
