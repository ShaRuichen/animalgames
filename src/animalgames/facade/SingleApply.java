package animalgames.facade;

public class SingleApply implements Apply {

    /* methods for single room applying */
    @Override
    public void checkIn(int id){
        System.out.println("A new single room is applied. Enjoy your time!");
        room1.welcome();
    }

    @Override
    public void checkOut(int id){
        System.out.println("Guest is checked out, room cleared.Thanks for using!");
        room1.checkout();
    }
}
