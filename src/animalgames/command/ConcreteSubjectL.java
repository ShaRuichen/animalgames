package animalgames.command;

//����֪ͨ
public class ConcreteSubjectL extends RaceResult
{
	
  public ConcreteSubjectL(int[] result1) {
		result = result1;
		// TODO Auto-generated constructor stub
	}

	public void notifyObserver()
  {
		System.out.println("----------------------------------------");
		System.out.println("End");
		System.out.println("��ʱ�������ˣ�");
      System.out.println("�����˵ĳɼ���");
            
      for(Object obs:observers)
      {
          ((Animal)obs).response(result);//�۲��߷���
      }
     
  }          
}