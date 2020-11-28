package animalgames.facade;

import java.util.Scanner;
import animalgames.Entry;

public class Test {
    @Entry(title = "创建客房并为与会人员申请")
    public static void test(){

        Scanner input = new Scanner(System.in);
        System.out.println("input 2 room numbers, press enter to explicit.");
        int room1ID = input.nextInt();
        int room2ID = input.nextInt();
        input.close();

        SingleRoom room1 = new SingleRoom(room1ID);
        DoubleRoom room2 = new DoubleRoom(room2ID);

        ApplyMaker appMaker = new ApplyMaker();

        appMaker.checkInSingle(room1ID);
        room1.welcome();
        appMaker.checkOutSingle(room1ID);
        room1.checkout();
        appMaker.checkInDouble(room2ID);
        room2.welcome();
        appMaker.checkOutDouble(room2ID);
        room2.checkout();
    }
    /*
    *   Testing.
    */
}
