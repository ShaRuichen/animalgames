package animalgames.businessdelegate;

import java.util.List;


/**
 * GetService服务实现对比赛结果信息的获得以及输出
 */
public class GetService implements BusinessService {
    @Override
    public void doProcessing(List<Score> scores){
        for(Score score:scores){
            System.out.println("[ game_id: "+ score.getid()
                    +",project: "+score.getproject()
                    +",rank: "+ score.getrank()+
                    "]");
        }
    }
}
