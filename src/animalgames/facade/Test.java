package animalgames.facade;

import animalgames.Entry;

public class Test {
    @Entry(title = "动物申请参加项目")
    public static void test(String[] args){
        
        ApplyMaker appMaker = new ApplyMaker();

        appMaker.addRunner();
        appMaker.removeRunner();
        appMaker.addJumper();
        appMaker.removeRunner();
    }
    /*
    *   测试用例
    */
}
