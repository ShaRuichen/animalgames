package animalgames.prototype;

import animalgames.Entry;

import java.util.Scanner;

public class PrototypeTest {
    @Entry(title = "��������")
    public static void test() {
        AudienceCache.loadCache();

        //clone��� ������Ʊ��audienceNum
        //������Ҫ�����Ʊ�����
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if(i==1)
        {
            Audience cloneAudience1 = (Audience) AudienceCache.getAudience("1");
            System.out.println(cloneAudience1.getType());
        }
        else if(i==2)
        {
            Audience cloneAudience2 = (Audience) AudienceCache.getAudience("2");
            System.out.println(cloneAudience2.getType());

        }
        else if(i==3)
        {
            Audience cloneAudience3 = (Audience) AudienceCache.getAudience("3");
            System.out.println(cloneAudience3.getType());

        }
        else
        {
            System.out.println("û�иñ�����Ŀ");
        }




    }
}
