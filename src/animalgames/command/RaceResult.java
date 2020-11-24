package animalgames.command;

import java.util.ArrayList;
import java.util.List;

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