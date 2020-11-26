package animalgames.factory;
//创建实现接口的实体类
public class StandardPool implements LANE{
    @Override
    public void use() {
        System.out.println("已创建标准泳道.");
    }
}
