package animalgames.prototype;

import java.util.Hashtable;
import jdk.internal.vm.PostVMInitHook;

/***
 * ���ڴ洢�ࣺ
 * �����ݿ��ȡ����ʵ����
 * (RaceAudience, SwimAudience,JumpAudience)����
 * �����Ǵ洢��һ��Hashtable��
 */
public class AudienceCache {
    private static Hashtable<String, Audience> audienceMap = new Hashtable<String, Audience>();

    public static Audience getAudience(String audienceId) {
        Audience cachedAudience = audienceMap.get(audienceId);
        return (Audience) cachedAudience.clone();
    }

    // ��ÿ����ڶ�Ҫ�������ݿ��ѯ������id�����ù���
    // audienceMap.put(audienceKey, audience);
    // ����Ҫ������ֹ���
    public static void loadCache() {
        RaceAudience raceAudience = new RaceAudience();
        raceAudience.setId("1");
        audienceMap.put(raceAudience.getId(), raceAudience);

        SwimAudience swimAudience = new SwimAudience();
        swimAudience.setId("2");
        audienceMap.put(swimAudience.getId(), swimAudience);

        JumpAudience jumpAudience = new JumpAudience();
        jumpAudience.setId("3");
        audienceMap.put(jumpAudience.getId(), jumpAudience);
    }
}

