package BusinessDelegate;

import java.util.List;

public class Client {
    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate){
        this.businessDelegate = businessDelegate;
    }

    public void doTask(List<Score> scores){
        businessDelegate.doTask(scores);
    }
}
