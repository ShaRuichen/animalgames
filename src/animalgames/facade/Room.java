package animalgames.facade;

public abstract class Room {
    protected int roomId;
    protected bool ifOccupied;

    public room(int id){
        roomId = id;
        create();
    }

    public abstract void welcome();
    public abstract void create();
    public abstract void checkout();
}
