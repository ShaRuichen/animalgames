package animalgames.command;

public class Lion extends Animal
{
	int ak = (int)(Math.random()*5)+1;
	int jk = (int)(Math.random()*10)+1;
	public Lion(String a) {
		type = "狮子";
		name = a;
		Swimminglevel = ak;
		Runninglevel = jk;
	}
	public Lion(String a, int ww, int nn) {
		name = a;
		Swimminglevel = ww;
		Runninglevel = nn;
	}
    public void response(int[] result)
    {
    	if(item == -1) {
    		System.out.printf("狮子" + name + "未参加这次比赛\n");
    	}
    	else {
	        System.out.println("狮子"+name+"的成绩第"+result[item-1]);
	        score = result[item-1];
    	}
    }

}