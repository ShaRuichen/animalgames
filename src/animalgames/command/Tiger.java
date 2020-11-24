package animalgames.command;

public class Tiger extends Animal
{
	int ak = (int)(Math.random()*7)+1;
	int jk = (int)(Math.random()*15)+1;
	public Tiger(String a) {
		type = "�ϻ�";
		name = a;
		Swimminglevel = ak;
		Runninglevel = jk;
	}
	public Tiger(String a, int ww, int nn) {
		name = a;
		Swimminglevel = ww;
		Runninglevel = nn;
	}
    public void response(int[] result)
    {
    	if(item == -1) {
    		System.out.printf("�ϻ�" + name + "δ�μ���α���\n");
    	}
    	else {
	        System.out.println("�ϻ�"+name+"�ĳɼ���"+result[item-1]);
	        score = result[item-1];
    	}
    }

}