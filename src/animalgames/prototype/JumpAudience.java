package animalgames.prototype;

/***
 * �̳�Audience��ʵ����JumpAudience
 */
public class JumpAudience extends Audience {
    public JumpAudience() {
        type = "JumpAudience";  // ������Ŀ�����ߣ��������������߱�������

    }

    @Override
    public void draw() {// �ӿ�ʵ��
        System.out.println("Inside Rectangle::draw() methiid.");
    }
}
