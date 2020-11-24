package factory;
//泳道工厂类
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
