package animalgames.compositeentity;


/***
 * �����ȶ���
 * �����μ�ĳ�������������˶�Ա
 */
public class Player {
    Player1 do1 = new Player1();
    Player2 do2 = new Player2();

    public void setData(String score1, String score2){
        do1.setData(score1);
        do2.setData(score2);
    }

    public String[] getData(){
        return new String[] {do1.getData(),do2.getData()};
}}
