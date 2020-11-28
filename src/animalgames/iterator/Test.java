package animalgames.iterator;

import animalgames.Entry;

//获取迭代器，并打印名字
public class Test {
    @Entry(title = "显示项目")
    public static void test() {
        game_name namesRepository = new game_name();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("项目 : " + name);
        }
    }
}
