package animalgames.bridge;

public abstract class Show {
    protected SelectAPI selectAPI;
    protected Show(SelectAPI selectAPI){
        this.selectAPI = selectAPI;
    }//展示可选时装
    public abstract void select();
}
