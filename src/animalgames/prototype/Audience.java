package animalgames.prototype;

/***
 * �ӿڳ����࣬�ṩ��¡�Ľӿ�
 */
public abstract class Audience implements Cloneable {
    private String id;       // �洢��hashtable�е�id
    protected String type;   // ������Ŀ�����ͣ����ڵ����ͣ�

    abstract void draw();    //����ӿ�

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