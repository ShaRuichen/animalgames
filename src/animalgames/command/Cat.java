package animalgames.command;

public class Cat extends Animal
{
	int ak = (int)(Math.random()*5)+1;
	int jk = (int)(Math.random()*10)+1;
	public Cat(String a) {
		type = "è";
		name = a;
		Swimminglevel = ak;
		Runninglevel = jk;
	}
	public Cat(String a, int ww, int nn) {
		name = a;
		Swimminglevel = ww;
		Runninglevel = nn;
	}
    public void response(int[] result)
    {
    	if(item == -1) {
    		System.out.printf("è" + name + "δ�μ���α���\n");
    	}
    	else {
	        System.out.println("è"+name+"�ĳɼ���"+result[item-1]);
	        score = result[item-1];
    	}
    }

}