package animalgames.prototype;

/***
 * �̳�Audience��ʵ����SwimAudience
 */
public class SwimAudience extends Audience {
    public SwimAudience() {
        type = "SwimAudience";  // ������Ŀ����Ӿ��������������Ӿ��������

    }

    @Override
    public void draw() {// �ӿ�ʵ��
        System.out.println("Inside Rectangle::draw() methiid.");
    }
}
