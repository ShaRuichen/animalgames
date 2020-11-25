package animalgames.bridge;

//抽象化角色：时装
abstract class Clothes
{
    protected Color color;
    public void setColor(Color color)
    {
        this.color=color;
    }
    public abstract String getName();
}
