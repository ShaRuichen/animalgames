public class DoubleApply implements Apply {

    /*
    * methods for double room applying
    */
    @Override
    public void checkIn(int id){
        System.out.println("double room " + id + " is applied for guests. Enjoy!");
    }

    @Override
    public void checkOut(int id){
        System.out.println("Guests have checked out from room " + id + ". Thanks for using our service.");
    }
}
