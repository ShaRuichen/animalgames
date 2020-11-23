package animalgames.compositeentity;


/***
 * 创建登记组合实体成绩的裁判类
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
