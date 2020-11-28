package animalgames.prototype;

import animalgames.Entry;

public class PrototypeTest {
    @Entry(title = "��������")
    public static void test() {
        AudienceCache.loadCache();

        //clone��� ������Ʊ��audienceNum
        //������Ҫ�����Ʊ�����
        Audience cloneAudience1 = (Audience) AudienceCache.getAudience("1");
        System.out.println(cloneAudience1.getType());

        Audience cloneAudience2 = (Audience) AudienceCache.getAudience("2");
        System.out.println(cloneAudience2.getType());

        Audience cloneAudience3 = (Audience) AudienceCache.getAudience("3");
        System.out.println(cloneAudience3.getType());

    }
}
