package animalgames.composite;

public class ShowAthleteTest {
    public static void main(String[] args) {
        Athlete Captain = new Athlete("John","领队", 10001);

        Athlete head1 = new Athlete("Robert","队长", 10002);

        Athlete head2 = new Athlete("Michel","队长", 10003);

        Athlete clerk1 = new Athlete("Laura","队员", 10004);
        Athlete clerk2 = new Athlete("Bob","队员", 10005);

        Athlete Executive1 = new Athlete("Richard","队员", 10006);
        Athlete Executive2 = new Athlete("Rob","队员", 10007);

        Captain.add(head1);
        Captain.add(head2);

        head1.add(Executive1);
        head1.add(Executive2);

        head2.add(clerk1);
        head2.add(clerk2);

        //打印该参赛队所有的名单
        System.out.println(Captain);
        for (Athlete headAthlete : Captain.getSubordinates()) {
            System.out.println(headAthlete);
            for (Athlete athlete : headAthlete.getSubordinates()) {
                System.out.println(athlete);
            }
        }
    }
}