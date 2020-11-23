package BusinessDelegate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Delegate {
    public static void main(String[] args){
        List<Score> scores = new ArrayList<Score>();
        BusinessDelegate businessDelegate = new BusinessDelegate();
        Client client = new Client(businessDelegate);

        Scanner sc = new Scanner(System.in);
        System.out.println("请选择：1.录入Score  2.查看Score  3.退出");
        int option = sc.nextInt();
        while (true){
            if (option == 1){
                businessDelegate.setDelegate("Put");
                client.doTask(scores);
            }
            else if (option == 2){
                businessDelegate.setDelegate("Get");
                client.doTask(scores);
            }
            else if(option == 3){
                break;
            }
            else {
                System.out.println("请输入正确选项");
            }
            System.out.println("请选择：1.录入Score  2.查看Score  3.退出");
            option = sc.nextInt();
        }
    }
}
