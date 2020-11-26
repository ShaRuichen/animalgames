package BusinessDelegate;

import java.util.List;
import java.util.Scanner;

public class GetService implements BusinessService{
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
