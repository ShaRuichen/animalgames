package FACTORY_;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("请输入创建泳道类型：1、短泳道；2、标准泳道;输入quit退出：");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        CreatLaneFactory CreatLaneFactory = new CreatLaneFactory();
        int t = 0;
        while(t == 0){
            if (option == 1){
                //获取 LANE1 的对象，并调用它的 use 方法
                LANE LANE1 = CreatLaneFactory.creatLANE("ShortPool");
                //调用 Circle 的 draw 方法
                LANE1.use();

            }
            else if (option == 2){
                LANE LANE2 = CreatLaneFactory.creatLANE("StandardPool");
                //调用 Rectangle 的 draw 方法
                LANE2.use();
            }
            else{
                System.out.println("请输入正确选项");
//                break;
            }
            System.out.println("请输入创建泳道类型：1、短泳道；2、标准泳道;输入quit退出：");
            option = sc.nextInt();
        }
//        CreatLaneFactory CreatLaneFactory = new CreatLaneFactory();
//        //获取 LANE1 的对象，并调用它的 use 方法
//        LANE LANE1 = CreatLaneFactory.creatLANE("ShortPool");
//        //调用 Circle 的 draw 方法
//        LANE1.use();
        //获取 Rectangle 的对象，并调用它的 draw 方法
//        LANE LANE2 = CreatLaneFactory.creatLANE("StandardPool");
//        //调用 Rectangle 的 draw 方法
//        LANE2.use();
    }
}
