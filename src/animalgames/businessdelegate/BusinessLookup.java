package BusinessDelegate;

public class BusinessLookup {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("Get")){
            return new GetService();
        }
        else
            return new PutService();
    }
}
