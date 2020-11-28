package animalgames.memento;

public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }//保存状态

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }//获取状态
}
