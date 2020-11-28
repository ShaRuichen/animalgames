package animalgames.bridge;

public abstract class Show {
    protected SelectAPI selectAPI;
    protected Show(SelectAPI selectAPI){
        this.selectAPI = selectAPI;
    }
    public abstract void select();
}
