package animalgames.compositeentity;


/***
 * �����Ǽ����ʵ��ɼ��Ĳ�����
 */
public class Referee {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData(){
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }

    public void setData(String score1, String score2){
        compositeEntity.setData(score1, score2);
    }
}
