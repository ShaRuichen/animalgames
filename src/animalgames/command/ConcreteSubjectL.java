package animalgames.command;

//喇叭通知
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
		System.out.println("这时喇叭响了：");
      System.out.println("所有人的成绩：");
            
      for(Object obs:observers)
      {
          ((Animal)obs).response(result);//观察者方法
      }
     
  }          
}