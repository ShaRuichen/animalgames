package animalgames.compositeentity;


/***
 * 创建组合实体
 * 某场比赛的成绩
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
