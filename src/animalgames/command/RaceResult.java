package animalgames.command;

import java.util.ArrayList;
import java.util.List;

//����ɼ����۲�
abstract class RaceResult
{
	//result������
	protected int result[];
	//���еĹ۲���
  protected List<Animal> observers=new ArrayList<Animal>();   
  //���ӹ۲��߷���
  public void add(Animal obs1)
  {
      observers.add(obs1);
  }    
  //ɾ���۲��߷���
  public void remove(Animal observer)
  {
      observers.remove(observer);
  }   
  public abstract void notifyObserver(); //֪ͨ�۲��߷���
}