package animalgames.command;

//����Ļ��ʾ
public class ConcreteSubject extends RaceResult
{
	
  public ConcreteSubject(int[] result1) {
		result = result1;
	}

	public void notifyObserver()
  {
		System.out.println("----------------------------------------");
		System.out.println("End");
		System.out.println("��ʱ����Ļ��ʾ��");
      System.out.println("�����˵ĳɼ���");
            
      for(Object obs:observers)
      {
          ((Animal)obs).response(result);
      }
     
  }          
}