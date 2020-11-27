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
}
