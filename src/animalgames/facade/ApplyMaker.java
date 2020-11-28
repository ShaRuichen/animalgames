package animalgames.facade

public class ApplyMaker {
    private Apply singleRoom;
    private Apply doubleRoom;

    /* the apply-making interface for guest users */
    public ApplyMaker(){
        doubleRoom = new DoubleApply();
        singleRoom = new SingleApply();
    }

    public void checkInSingle(int id){
        singleRoom.checkIn(id);
    }

    public void checkInDouble(int id){
        doubleRoom.checkIn(id);
    }

    public void checkOutSingle(int id){
        singleRoom.checkOut(id);
    }

    public void checkOutDouble(int id){
        doubleRoom.checkOut(id);
    }
}
