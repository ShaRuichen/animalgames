package animalgames.businessdelegate;

import java.util.List;

/**
 * businessDelegate的实现表示层
 */
public class Client {
    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate){
        this.businessDelegate = businessDelegate;
    }

    public void doTask(List<Score> scores){
        businessDelegate.doTask(scores);
    }
}
