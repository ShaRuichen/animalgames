package animalgames.compositeentity;

/***
 * ���еǼǱ����ɼ�
 */
public class ConpositeentityDemo {
    public static void main(String[] args) {
        Referee referee = new Referee();
        // ��һ������
        referee.setData("Score1", "Score2");
        referee.printData();
        // �ڶ�������
        referee.setData("Score1", "Score2");
        referee.printData();
    }
}
