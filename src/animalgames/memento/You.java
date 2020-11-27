package animalgames.memento;

//发起人：您
class You{
    private String SportName;
    public void set(String name)
    {
        SportName=name;
    }
    public String get()
    {
        return SportName;
    }
    public Sports createMemento()
    {
        return new Sports(SportName);
    }
    public void restoreMemento(Sports p)
    {
        set(p.getName());
    }
}
