package animalgames.prototype;

/***
 * �̳�Audience��ʵ����RaceAudience
 */
public class RaceAudience extends Audience{
    public RaceAudience() {
        type = "RaceAudience";  // ������Ŀ�����ܣ������������ܲ���������

    }


    @Override
    public void draw() {// �ӿ�ʵ��
        System.out.println("Inside Rectangle::draw() methiid.");
    }
}

