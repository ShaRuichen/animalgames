package animalgames.factory;
//创建一个工厂，生成基于给定信息的实体类的对象
public class CreatLaneFactory {
    public LANE creatLANE(String LANEType) {
        if (LANEType == null) {
            return null;
        }
        if (LANEType.equalsIgnoreCase("ShortPool")) {
            return new ShortPool();
        } else if (LANEType.equalsIgnoreCase("StandardPool")) {
            return new StandardPool();
        }
        return null;
    }
}
