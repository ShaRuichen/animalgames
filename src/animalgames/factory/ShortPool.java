package factory;
//实现接口的实体类
public class ShortPool implements LANE{
    @Override
    public void use() {
        System.out.println("已创建短泳道.");
    }
}
