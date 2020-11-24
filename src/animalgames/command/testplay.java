package animalgames.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testplay {
	public static void test() throws IOException, InterruptedException {
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
        Observer.tryo(ru,"Swim","Screen");
        Observer.tryo(ru,"Run","O");
        for(Animal obs:ru)
        {
        	obs.Summary();
        }
//    	Context c=new Context();
    }
}
