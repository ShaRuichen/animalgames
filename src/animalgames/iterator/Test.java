package animalgames.iterator;

import animalgames.Entry;

//获取迭代器，并打印名字
public class Test {
    @Entry(title = "显示名单")
    public static void test() {
        Player namesRepository = new Player();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
