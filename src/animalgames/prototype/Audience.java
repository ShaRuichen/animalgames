package animalgames.prototype;

/***
 * 接口抽象类，提供克隆的接口
 */
public abstract class Audience implements Cloneable {
    private String id;       // 存储在hashtable中的id
    protected String type;   // 比赛项目的类型（观众的类型）

    abstract void draw();    //抽象接口

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}