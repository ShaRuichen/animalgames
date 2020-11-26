package animalgames.businessdelegate;

/**
 * lookup查找，通过选择判断返回不同的业务对应的实现类
 */
public class BusinessLookup {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("Get")){
            return new GetService();
        }
        else
            return new PutService();
    }
}
