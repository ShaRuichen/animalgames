package animalgames.command;

import java.util.ArrayList;
import java.util.List;

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
