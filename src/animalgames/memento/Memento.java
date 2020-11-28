package animalgames.memento;

public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }//记录状态

    public String getState(){
        return state;
    }//返回所需状态
}
