package filter;

import BusinessDelegate.Score;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class filter {
    public static void main(String[] args){
        List<Animal> animals = new ArrayList<Animal>();

        Scanner sc = new Scanner(System.in);
        System.out.println("请选择：1.录入参赛信息  2.查看(filter)参赛信息  3.退出");
        int option = sc.nextInt();

/**        test
 *         animals.add(new Animal("asd","Male","highjump"));
 *         animals.add(new Animal("222","Female","highjump"));
 *         animals.add(new Animal("333","Male","longjump"));
 *         animals.add(new Animal("444","Male","highjump"));
 *         animals.add(new Animal("555","Male","marathon"));
 *         animals.add(new Animal("555","Male","longjump"));
 *         animals.add(new Animal("666","Female","100m"));
 */

        while (true){
            if (option == 1){
                putinfo(animals);
            }
            else if (option == 2){
                showinfo(animals);
            }
            else if(option == 3){
                break;
            }
            else {
                System.out.println("请输入正确选项");
            }
            System.out.println("请选择：1.录入参赛信息  2.查看(filter)参赛信息  3.退出");
            option = sc.nextInt();
        }
    }

    /**
     * 打印list信息
     * @param animals
     */
    public static void printinfo(List<Animal> animals){
        for(Animal animal:animals){
            System.out.println("Animal:[ name: "+ animal.getName()
            +",genfer: "+animal.getGender()
            +",project: "+ animal.getproject()+
            "]");
        }
    }

    /**
     * 输入参赛信息
     * @param animals
     */
    public static void putinfo(List<Animal> animals){
        Scanner sc = new Scanner(System.in);

        String temp1 = null ;
        String temp2 = null ;
        String temp3 = null ;

        System.out.println("请输入姓名: ");
        temp1 = sc.nextLine();
        System.out.println("选择性别 1.Male  2.Female: ");
        int num2 = sc.nextInt();
        if(num2 == 1){
            temp2 = "Male";
        }
        else{
            temp2 = "Female";
        }
        System.out.println("选择比赛项目: 1.highjump 2.longjump 3.100m 4.marathon");
        int num3 = sc.nextInt();
        if (num3 == 1){
            temp3 = "highjump";
        }
        else if (num3 == 2){
            temp3 = "longjump";
        }
        else if (num3 == 3){
            temp3 = "100m";
        }
        else {
            temp3 = "marathon";
        }
        Animal temp = new Animal(temp1,temp2,temp3);
        animals.add(temp);
    }

    /**
     * 根据选择输出参赛信息（filter）
     * @param animals
     */
    public static void showinfo(List<Animal> animals){
        Scanner sc = new Scanner(System.in);

        Criteria highjump = new Criteria_highjump();
        Criteria longjump = new Criteria_longjump();
        Criteria _100m = new Criteria_100m();
        Criteria marathon = new Criteria_marathon();
        Criteria or = new OrCriteria(longjump,marathon);

        System.out.println("请输入想要查看的项目 : 1.highjump 2.longjump 3.100m 4.marathon");
        int num = sc.nextInt();
        if(num == 1){
            System.out.println("highjump: ");
            printinfo(highjump.meetCriteria(animals));
        }
        else if (num == 2){
            System.out.println("longjump: ");
            printinfo(longjump.meetCriteria(animals));
        }
        else if (num == 3){
            System.out.println("100m: ");
            printinfo(_100m.meetCriteria(animals));
        }
        else {
            System.out.println("marathon: ");
            printinfo(marathon.meetCriteria(animals));
        }
    }

}
