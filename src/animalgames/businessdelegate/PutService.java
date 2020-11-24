package animalgames.businessdelegate;

import java.util.List;
import java.util.Scanner;

/**
 * PutService服务实现对比赛结果信息的出入，并存在建立的scores中
 */
public class PutService implements BusinessService {

    @Override
    public void doProcessing(List<Score> scores){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入id: ");
        String temp1 = sc.nextLine();
        System.out.println("请输入比赛项目: ");
        String temp2 = sc.nextLine();
        System.out.println("请输入名次: ");
        String temp3 = sc.nextLine();
        Score temp = new Score(temp1,temp2,temp3);
        scores.add(temp);
    }
}
