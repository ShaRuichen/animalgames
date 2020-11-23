package animalgames.strategy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Observer {
	//具体的执行函数
	public static void tryo(List<Animal>aa,String j,String i) throws IOException, InterruptedException {
    	Context c=new Context();
    	Race s;
    	if(j == "Swim") {
    		Racstart a=new Racstart();
    		s = a.new SwimCon();
    		
    		System.out.println("请输入游泳参赛队员号码，-1结束，默认全部参赛，号码数：1~"+aa.size());

    	}
    	else {
    		Racstart a=new Racstart();
    		s = a.new Run();
    		System.out.println("请输入跑步参赛队员号码，-1结束，默认全部参赛，号码数：1~"+aa.size());
    	}
    	List<Animal> ru1 = new ArrayList<Animal>();
		while(true) {
			Scanner input = new Scanner(System.in); 
			int ii = input.nextInt(); 
			
			if(ii==-1) {
				break;
			}
			else {
				System.out.println(ii+"号队员为"+aa.get(ii-1).getTy()+aa.get(ii-1).getName());
				ru1.add(aa.get(ii-1));
			}
		}
		if(ru1.size()==0) {
			ru1 = aa;
		}
        for(Object obs:ru1)
        {
            s.add((Animal)obs);
        }
        System.out.println("参赛队员有：");
        for(Animal obs:ru1)
        {
        	System.out.println(obs.getTy()+obs.getName()+"  号码:"+obs.item);
        }
        
        System.out.println("Start");
        System.out.println("----------------------------------------"); 
        c.setStrategy(s);
        int[] result = c.strategyMethod();
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("...");
        RaceResult subject;
        if(i=="Screen") {
        	subject=new ConcreteSubject(result);
        }
        else {
        	subject=new ConcreteSubjectL(result);
        }
        for(Object obs:ru1)
        {
            subject.add((Animal)obs);
        }
        Thread.sleep(500);
        subject.notifyObserver();
        Thread.sleep(1000);
        System.out.println("----------------------------------------"); 
        System.out.println("颁奖开始");
        Thread.sleep(1000);
        for(Animal obs:ru1)
        {
        	Command cmd;
        	if(obs.score == 1) {cmd=new ConcreteCommand(obs);Invoker ir=new Invoker(cmd);ir.call();Thread.sleep(1000);}
        	else if(obs.score == 2) {cmd=new ConcreteCommandB(obs);Invoker ir=new Invoker(cmd);ir.call();Thread.sleep(1000);}
        	else if(obs.score == 3) {cmd = new ConcreteCommandC(obs);Invoker ir=new Invoker(cmd);ir.call();Thread.sleep(1000);} 
            
        }
        System.out.println("----------------------------------------");
        }
}
	
//抽象成绩被观察
abstract class RaceResult
{
	//result即排名
	protected int result[];
	//所有的观察者
    protected List<Animal> observers=new ArrayList<Animal>();   
    //增加观察者方法
    public void add(Animal obs1)
    {
        observers.add(obs1);
    }    
    //删除观察者方法
    public void remove(Animal observer)
    {
        observers.remove(observer);
    }   
    public abstract void notifyObserver(); //通知观察者方法
}

//具体目标具体某一场比赛的


//大屏幕显示
class ConcreteSubject extends RaceResult
{
	
    public ConcreteSubject(int[] result1) {
		result = result1;
	}

	public void notifyObserver()
    {
		System.out.println("----------------------------------------");
		System.out.println("End");
		System.out.println("这时大屏幕显示：");
        System.out.println("所有人的成绩：");
              
        for(Object obs:observers)
        {
            ((Animal)obs).response(result);
        }
       
    }          
}


//喇叭通知
class ConcreteSubjectL extends RaceResult
{
	
    public ConcreteSubjectL(int[] result1) {
		result = result1;
		// TODO Auto-generated constructor stub
	}

	public void notifyObserver()
    {
		System.out.println("----------------------------------------");
		System.out.println("End");
		System.out.println("这时喇叭响了：");
        System.out.println("所有人的成绩：");
              
        for(Object obs:observers)
        {
            ((Animal)obs).response(result);//观察者方法
        }
       
    }          
}

//抽象观察者
abstract class Animal
{
    abstract void response(int[] result); //反应
    protected int countA = 0;//金牌 
    protected int countB = 0;//银牌 
    protected int countC = 0;//铜牌 
    protected String type;
    
    public int Swimminglevel;
    public int Runninglevel;
    
    protected int level;
	protected int item = -1; //本人编号
	protected String name;
	protected int score; //当前名次
	public int getSw() {
		return Swimminglevel;
	}
	public int getRn() {
		return Runninglevel;
	}
	public String getTy() {
		return type;
	}
	public void setNum(int h) {
		item = h;
	}
	public String getName() {
		return name;
	}
	
	public void action() {
		// TODO Auto-generated method stub
		if(score == 1) {
			System.out.printf(name +"获得了金牌\n");
			countA++;
		}
		else if(score == 2) {
			System.out.printf(name +"获得了银牌\n");
			countB++;
		}
		else if(score ==3) {
			System.out.printf(name +"获得了铜牌\n");
			countC++;
		}
		else {
			System.out.printf(name +"没有获得奖牌\n");
		}
	}
	public void Summary() {
		System.out.printf(name + "获得" + countA + "枚金牌" + " " + countB + "枚银牌" + " " + countC + "枚铜牌\n");
	}
}
//具体观察者1
class Rabbit extends Animal
{
	int ak = (int)(Math.random()*10)+1;
	int jk = (int)(Math.random()*10)+1;
	public Rabbit(String a) {
		type = "兔子";
		name = a;
		Swimminglevel = ak;
		Runninglevel = jk;
	}
	public Rabbit(String a, int ww, int nn) {
		name = a;
		Swimminglevel = ww;
		Runninglevel = nn;
	}
    public void response(int[] result)
    {
    	if(item == -1) {
    		System.out.printf("兔子"+name+"未参加这次比赛\n");
    	}
    	else {
	        System.out.println("兔子"+name+"的成绩第"+result[item-1]);
	        score = result[item-1];
    	}
    }

}
class Tiger extends Animal
{
	int ak = (int)(Math.random()*7)+1;
	int jk = (int)(Math.random()*15)+1;
	public Tiger(String a) {
		type = "老虎";
		name = a;
		Swimminglevel = ak;
		Runninglevel = jk;
	}
	public Tiger(String a, int ww, int nn) {
		name = a;
		Swimminglevel = ww;
		Runninglevel = nn;
	}
    public void response(int[] result)
    {
    	if(item == -1) {
    		System.out.printf("老虎" + name + "未参加这次比赛\n");
    	}
    	else {
	        System.out.println("老虎"+name+"的成绩第"+result[item-1]);
	        score = result[item-1];
    	}
    }

}
class Lion extends Animal
{
	int ak = (int)(Math.random()*5)+1;
	int jk = (int)(Math.random()*10)+1;
	public Lion(String a) {
		type = "狮子";
		name = a;
		Swimminglevel = ak;
		Runninglevel = jk;
	}
	public Lion(String a, int ww, int nn) {
		name = a;
		Swimminglevel = ww;
		Runninglevel = nn;
	}
    public void response(int[] result)
    {
    	if(item == -1) {
    		System.out.printf("狮子" + name + "未参加这次比赛\n");
    	}
    	else {
	        System.out.println("狮子"+name+"的成绩第"+result[item-1]);
	        score = result[item-1];
    	}
    }

}
class Cat extends Animal
{
	int ak = (int)(Math.random()*5)+1;
	int jk = (int)(Math.random()*10)+1;
	public Cat(String a) {
		type = "猫";
		name = a;
		Swimminglevel = ak;
		Runninglevel = jk;
	}
	public Cat(String a, int ww, int nn) {
		name = a;
		Swimminglevel = ww;
		Runninglevel = nn;
	}
    public void response(int[] result)
    {
    	if(item == -1) {
    		System.out.printf("猫" + name + "未参加这次比赛\n");
    	}
    	else {
	        System.out.println("猫"+name+"的成绩第"+result[item-1]);
	        score = result[item-1];
    	}
    }

}
