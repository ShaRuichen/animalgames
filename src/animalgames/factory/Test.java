package animalgames.factory;

import java.util.Scanner;

import animalgames.Entry;

public class Test {
    @Entry(title = "创建游泳赛道")
    public static void test() {
        System.out.println("请输入创建泳道类型：1、短泳道；2、标准泳道;输入3退出：");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        CreatLaneFactory CreatLaneFactory = new CreatLaneFactory();
        while(true){
            if (option == 1){
                //获取 LANE1 的对象，并调用它的 use 方法
                LANE LANE1 = CreatLaneFactory.creatLANE("ShortPool");
                //调用 LANE1 的 use 方法
                LANE1.use();

            }
            else if (option == 2){
                LANE LANE2 = CreatLaneFactory.creatLANE("StandardPool");
                //调用 LANE2 的 use 方法
                LANE2.use();
            }
            else if (option ==3){
                break;
            }
            else{
                System.out.println("请输入正确选项");
//                break;
            }
            System.out.println("请输入创建泳道类型：1、短泳道；2、标准泳道;输入quit退出：");
            option = sc.nextInt();
        }

    }
}
