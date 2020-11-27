package animalgames.command;

//具体观察者1
public class Rabbit extends Animal
{
	int ak = (int)(Math.random()*10)+1;
	int jk = (int)(Math.random()*10)+1;
	public Rabbit(String a) {
		type = "兔子";
		name = a;
		Swimminglevel = ak;
		Runninglevel = jk;
	}
	public Rabbit(String a, int ww, int nn) {
		name = a;
		Swimminglevel = ww;
		Runninglevel = nn;
	}
  public void response(int[] result)
  {
  	if(item == -1) {
  		System.out.printf("兔子"+name+"未参加这次比赛\n");
  	}
  	else {
	        System.out.println("兔子"+name+"的成绩第"+result[item-1]);
	        score = result[item-1];
  	}
  }

}
