package animalgames.compositeentity;

import animalgames.Entry;

import java.util.Scanner;

/***
 * ���еǼǱ����ɼ�
 */

public class CompositeentityTest {
    @Entry(title = "�ǼǱ����ɼ�")
    public static void test() {
        Referee referee = new Referee();
        System.out.println("��Ǽǵ�һ�������ɼ�");
        // ��һ������
        Scanner first1 = new Scanner(System.in);
        String firstScore1 = first1.next();
        Scanner first2 = new Scanner(System.in);
        String firstScore2 = first2.next();
        referee.setData(firstScore1, firstScore2);
        referee.printData();
        // �ڶ�������
        System.out.println("��Ǽǵڶ��������ɼ�");
        Scanner second1 = new Scanner(System.in);
        String secondScore1 = second1.next();
        Scanner second2 = new Scanner(System.in);
        String secondScore2 = second2.next();
        referee.setData(secondScore1, secondScore2);
        referee.printData();
    }
}



