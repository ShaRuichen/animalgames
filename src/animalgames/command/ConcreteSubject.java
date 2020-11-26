package animalgames.command;

//大屏幕显示
public class ConcreteSubject extends RaceResult
{
	
  public ConcreteSubject(int[] result1) {
		result = result1;
	}

	public void notifyObserver()
  {
		System.out.println("----------------------------------------");
		System.out.println("End");
		System.out.println("这时大屏幕显示：");
      System.out.println("所有人的成绩：");
            
      for(Object obs:observers)
      {
          ((Animal)obs).response(result);
      }
     
  }          
}