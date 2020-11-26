package animalgames.prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        AudienceCache.loadCache();

        //clone��� ������Ʊ��audienceNum
        //������Ҫ�����Ʊ�����
        Audience cloneAudience1 = (Audience) AudienceCache.getAudience("1");
        System.out.println(cloneAudience1.getType() + ":" + audienceNum1);

        Audience cloneAudience2 = (Audience) AudienceCache.getAudience("2");
        System.out.println(cloneAudience2.getType() + ":" + audienceNum2);

        Audience cloneAudience3 = (Audience) AudienceCache.getAudience("3");
        System.out.println(cloneAudience3.getType() + ":" + audienceNum3);

    }
}
