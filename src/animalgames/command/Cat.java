package animalgames.command;

public class Cat extends Animal
{
	int ak = (int)(Math.random()*5)+1;
	int jk = (int)(Math.random()*10)+1;
	public Cat(String a) {
		type = "猫";
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
    		System.out.printf("猫" + name + "未参加这次比赛\n");
    	}
    	else {
	        System.out.println("猫"+name+"的成绩第"+result[item-1]);
	        score = result[item-1];
    	}
    }

}