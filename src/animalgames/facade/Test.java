package animalgames.facade;

import animalgames.Entry;

public class Test {
    @Entry(title = "创建客房并为与会人员申请")
    public static void test(){
        
        SingleRoom room1 = new SingleRoom(201);
        DoubleRoom room2 = new DoubleRoom(301);

        ApplyMaker appMaker = new ApplyMaker();

        appMaker.checkInSingle(201);
        appMaker.checkOutSingle(201);
        appMaker.checkInDouble(301);
        appMaker.checkOutDouble(301);
    }
    /*
    *   Testing.
    */
}
