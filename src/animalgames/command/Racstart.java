package animalgames.command;

import java.util.List;

//��ʼ����
public class Racstart{
	public int[] StartRace(List<Animal> na,int[] aa, String f) {
		int maxone = -1;
  	int record = 0;
  	int Q=0;
		while(na.isEmpty()== false) {
			if(f == "Swim") {
	    		for(Object obs:na)
			        {
			        	if(((Animal)obs).getSw()>maxone) {
			        		maxone = ((Animal)obs).getSw();
			        		record = ((Animal)obs).item;
			        	}
			        }
		    		for(Object obs:na) {
		    			if(((Animal)obs).getSw() == maxone) {
		    				na.remove(obs);
		    				maxone=0;
		    				break;
		    			}
		    		}
				}
			else if(f == "Run") {
				for(Object obs:na)
		        {
		        	if(((Animal)obs).getRn()>maxone) {
		        		maxone = ((Animal)obs).getRn();
		        		record = ((Animal)obs).item;
		        	}
		        }
	    		for(Object obs:na) {
	    			if(((Animal)obs).getRn() == maxone) {
	    				na.remove(obs);
	    				maxone=0;
	    				break;
	    			}
	    		}
			}
  		Q++;
  		aa[record-1]=Q;//����	
		}
		return aa;
	}
	//�����������Ӿ
	class SwimCon extends Race
	{
		
	    public int[] strategyMethod()
	    {
	    	System.out.println("Swimming");
	    	result = new int[i];//ʵ�廯
	    	StartRace(name,result,"Swim");
	    	return result;
	    }
}
	//�����ܲ�
	class Run extends Race
	{
	    public int[] strategyMethod()
	    {
	    	System.out.println("Runnimg");
	    	result = new int[i];//ʵ�廯
	    	StartRace(name,result,"Run");
	    	return result;
	    }
	}
}