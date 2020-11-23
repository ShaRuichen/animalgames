package animalgames.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyPattern {

}
//抽象类比赛
abstract class Race
{   
	protected List<Animal> name;
    public abstract int[] strategyMethod();    //定义具体比赛的抽象类将被覆写
    protected int result[];//比赛的结果
	int i = 0;//当前运动员号码
	int num = 0;//总人数
    public Race() {
    	name=new ArrayList<Animal>();//参加比赛的名单
    }
	//录入运动员
	public void add(Animal obs) {
		name.add(obs);
		i++;
		num++;
		System.out.printf("录入"+obs.getName()+"成功，当前号码:"+i +"当前参赛动物数:"+num+"\n");
		obs.setNum(i);
	}
	//删除运动员
	public void remove(Animal aa) {
		name.remove(aa);
		num--;
		System.out.printf("删除成功，当前号码:",i ,"当前参赛动物数:",num);
	}
	
	//获得
	public int[] getRe() {
		return result;
	}
	
}
//开始比赛
class Racstart{
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
    		aa[record-1]=Q;//名次	
		}
		return aa;
	}
	//具体比赛：游泳
	class SwimCon extends Race
	{
		
	    public int[] strategyMethod()
	    {
	    	System.out.println("Swimming");
	    	result = new int[i];//实体化
	    	StartRace(name,result,"Swim");
	    	return result;
	    }
}
	//比赛跑步
	class Run extends Race
	{
	    public int[] strategyMethod()
	    {
	    	System.out.println("Runnimg");
	    	result = new int[i];//实体化
	    	StartRace(name,result,"Run");
	    	return result;
	    }
	}
}

//比赛环境
class Context
{
    private Race strategy;
    public Race getStrategy()
    {
        return strategy;
    }
    public void setStrategy(Race strategy)
    {
        this.strategy=strategy;
    }
    public int[] strategyMethod()
    {
        int[] m = strategy.strategyMethod();
        return m;
    }
}
