package animalgames.command;

//����۲���1
public class Rabbit extends Animal
{
	int ak = (int)(Math.random()*10)+1;
	int jk = (int)(Math.random()*10)+1;
	public Rabbit(String a) {
		type = "����";
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
  		System.out.printf("����"+name+"δ�μ���α���\n");
  	}
  	else {
	        System.out.println("����"+name+"�ĳɼ���"+result[item-1]);
	        score = result[item-1];
  	}
  }

}
