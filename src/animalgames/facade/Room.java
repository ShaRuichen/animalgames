package animalgames.facade

public abstract class Room {
    protected int roomId;
    protected boolean ifOccupied;

    public abstract void welcome();
    public abstract void create();
    public abstract void checkout();
}
