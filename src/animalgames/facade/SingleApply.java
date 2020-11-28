public class SingleApply implements Apply {

    /* methods for single room applying */
    @Override
    public void checkIn(int id){
        System.out.println("single room "+ id + " is applied. Enjoy your time!");
    }

    @Override
    public void checkOut(int id){
        System.out.println("Guest is checked out, room cleared.Thanks for using!");
    }
}
