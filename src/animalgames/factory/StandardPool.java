package FACTORY_;

public class StandardPool implements LANE{
    @Override
    public void use() {
        System.out.println("已创建标准泳道.");
    }
}
