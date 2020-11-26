package animalgames.prototype;

import java.util.Hashtable;
import jdk.internal.vm.PostVMInitHook;

/***
 * 观众存储类：
 * 从数据库获取观众实体类
 * (RaceAudience, SwimAudience,JumpAudience)，并
 * 把它们存储在一个Hashtable中
 */
public class AudienceCache {
    private static Hashtable<String, Audience> audienceMap = new Hashtable<String, Audience>();

    public static Audience getAudience(String audienceId) {
        Audience cachedAudience = audienceMap.get(audienceId);
        return (Audience) cachedAudience.clone();
    }

    // 对每类观众都要运行数据库查询并根据id创建该观众
    // audienceMap.put(audienceKey, audience);
    // 我们要添加三种观众
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

