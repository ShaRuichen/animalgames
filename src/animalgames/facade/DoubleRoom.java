package animalgames.facade

public class DoubleRoom extends Room {
    public DoubleRoom(int id) {
        roomId = id;
        create();
    }

    @Override
    public void create(){
        System.out.println("A new double room with number " + roomId + " is created.");
        ifOccupied = false;
    }

    @Override
    public void welcome(){
        System.out.println("Room: Welcome to room " + roomId + " !");
        ifOccupied = true;
    }

    @Override
    public void checkout(){
        System.out.println("Room: See you next time!");
        ifOccupied = false;
    }
}
