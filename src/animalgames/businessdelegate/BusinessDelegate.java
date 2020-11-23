package BusinessDelegate;

import java.util.List;

/**
 * BusinessDelegate,连接实现业务服务层和Lookup
 */
public class BusinessDelegate {
    private BusinessLookup lookup = new BusinessLookup();
    private BusinessService businessService;
    private String serviceType;

    public void setDelegate(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(List<Score> scores){
        businessService = lookup.getBusinessService(serviceType);
        businessService.doProcessing(scores);
    }
}
