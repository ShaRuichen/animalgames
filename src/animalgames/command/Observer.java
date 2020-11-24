package animalgames.command;

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
	
	//main函数
    public static void main(String[] args) throws IOException, InterruptedException
    {
    	System.out.println("##########################################");
    	System.out.println("#                  动物运动会开始！                               #");
    	System.out.println("##########################################");
    	System.out.println("#       说明：当输入名单为空时我们将使用默认名单                #");
    	System.out.println("#       如果想使用默认名单，请注册时直接输入#       #");
    	System.out.println("##########################################");
    	List<Animal> ru = new ArrayList<Animal>();
    	while(true) {
	    	System.out.println("请注册全体运动员!请输入动物的名字，如果输入为#结束录入");
	    	Scanner sca=new Scanner(System.in);
			String b=sca.next();
			char bb= b.charAt(0);
			if(bb=='#')break;
	    	System.out.println("请录入信息!选择动物类别：老虎（A）   狮子（B）   兔子（C）   猫（D），如果输入为#结束录入");
	    	char a = (char)System.in.read();
	    	if(a=='#') {break;}
	    	switch(a) {
	    		case 'A': 
	    			Animal obs = new Tiger(b);
	    			ru.add(obs);
	    			break;
	    		case 'B': 
	    			Animal obs1 = new Lion(b);
	    			ru.add(obs1);
	    			break;
	    		case 'C':
	    			Animal obs2 = new Rabbit(b);
	    			ru.add(obs2);
	    			break;
	    		case 'D':
	    			Animal obs3 = new Cat(b);
	    			ru.add(obs3);
	    			break;
	    		default:
	    			System.out.println("输入不符合规范");
	    	}
	    	System.out.println("完成！");
    	}
    	if(ru.size() == 0) {
    		Animal obs1 = new Rabbit("Kitt");
    		Animal obs2 = new Tiger("Amy");
    		Animal obs3 = new Lion("Blue");
    		Animal obs4 = new Rabbit("Nice");
    		Animal obs5 = new Tiger("Ace");
    		Animal obs6 = new Cat("Hk");
    		ru.add(obs1);
    		ru.add(obs2);
    		ru.add(obs3);
    		ru.add(obs4);
    		ru.add(obs5);
    		ru.add(obs6);
    	}
    	System.out.println("全体名单");
    	
    	int next=1;
    	for(Animal obs:ru)
        {
        	System.out.println(obs.getTy()+obs.getName()+"  号码"+next);
        	next++;
        }
        tryo(ru,"Swim","Screen");
        tryo(ru,"Run","O");
        for(Animal obs:ru)
        {
        	obs.Summary();
        }
//    	Context c=new Context();
    }
}
