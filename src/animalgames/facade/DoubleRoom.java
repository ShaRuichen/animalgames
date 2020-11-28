package animalgames.facade;

public class DoubleRoom extends Room {
    public void create(){
        System.out.println("A new double room with number" + roomId + "is created.");
        ifOccupied = false;
    }

    public void welcome(){
        System.out.println("Welcome to room " + roomId + " !");
        ifOccupied = true;
    }

    public void checkout(){
        System.out.println("See you next time!");
        ifOccupied = false;
    }
}
