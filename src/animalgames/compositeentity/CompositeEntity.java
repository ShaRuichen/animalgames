package animalgames.compositeentity;


/***
 * �������ʵ��
 * ĳ�������ĳɼ�
 */
public class CompositeEntity {
    private Player cgo = new Player();

    public void setData(String score1, String score2){
        cgo.setData(score1, score2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
