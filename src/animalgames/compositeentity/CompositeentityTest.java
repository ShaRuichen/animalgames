package animalgames.compositeentity;

import animalgames.Entry;

/***
 * ���еǼǱ����ɼ�
 */

public class CompositeentityTest {
    @Entry(title = "�ǼǱ����ɼ�")
    public static void test() {
        Referee referee = new Referee();
        // ��һ������
        referee.setData("Score1", "Score2");
        referee.printData();
        // �ڶ�������
        referee.setData("Score1", "Score2");
        referee.printData();
    }
}



