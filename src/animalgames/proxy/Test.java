package animalgames.proxy;

import java.util.Scanner;

/**
 * 对应代理模式的实现，按照选项操作通过代理实现购票以及售票信息查看
 */
public class Test {
    public static void test(){
        Scanner sc = new Scanner(System.in);
        Ticket ticket = new Proxyticket();
        System.out.println("请选择：1.购票  2.查看  3.退出");
        int option = sc.nextInt();
        while (true){
            if(option == 1){
                ticket.sellticket();
            }
            else if(option == 2){
                ticket.checkticket();
            }
            else if(option == 3){
                sc.close();
                break;
            }
            else {
                System.out.println("请输入正确选项");
            }
            System.out.println("请选择：1.购票  2.查看  3.退出");
            option = sc.nextInt();
        }
    }
}
