package animalgames.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Observer {
	//�����ִ�к���
	public static void tryo(List<Animal>aa,String j,String i) throws IOException, InterruptedException {
    	Context c=new Context();
    	Race s;
    	if(j == "Swim") {
    		Racstart a=new Racstart();
    		s = a.new SwimCon();
    		
    		System.out.println("��������Ӿ������Ա���룬-1������Ĭ��ȫ����������������1~"+aa.size());

    	}
    	else {
    		Racstart a=new Racstart();
    		s = a.new Run();
    		System.out.println("�������ܲ�������Ա���룬-1������Ĭ��ȫ����������������1~"+aa.size());
    	}
    	List<Animal> ru1 = new ArrayList<Animal>();
		while(true) {
			Scanner input = new Scanner(System.in); 
			int ii = input.nextInt(); 
			
			if(ii==-1) {
				break;
			}
			else {
				System.out.println(ii+"�Ŷ�ԱΪ"+aa.get(ii-1).getTy()+aa.get(ii-1).getName());
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
        System.out.println("������Ա�У�");
        for(Animal obs:ru1)
        {
        	System.out.println(obs.getTy()+obs.getName()+"  ����:"+obs.item);
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
        System.out.println("�佱��ʼ");
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
	
	//main����
    public static void main(String[] args) throws IOException, InterruptedException
    {
    	System.out.println("##########################################");
    	System.out.println("#                  �����˶��Ὺʼ��                               #");
    	System.out.println("##########################################");
    	System.out.println("#       ˵��������������Ϊ��ʱ���ǽ�ʹ��Ĭ������                #");
    	System.out.println("#       �����ʹ��Ĭ����������ע��ʱֱ������#       #");
    	System.out.println("##########################################");
    	List<Animal> ru = new ArrayList<Animal>();
    	while(true) {
	    	System.out.println("��ע��ȫ���˶�Ա!�����붯������֣��������Ϊ#����¼��");
	    	Scanner sca=new Scanner(System.in);
			String b=sca.next();
			char bb= b.charAt(0);
			if(bb=='#')break;
	    	System.out.println("��¼����Ϣ!ѡ��������ϻ���A��   ʨ�ӣ�B��   ���ӣ�C��   è��D�����������Ϊ#����¼��");
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
	    			System.out.println("���벻���Ϲ淶");
	    	}
	    	System.out.println("��ɣ�");
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
    	System.out.println("ȫ������");
    	
    	int next=1;
    	for(Animal obs:ru)
        {
        	System.out.println(obs.getTy()+obs.getName()+"  ����"+next);
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
