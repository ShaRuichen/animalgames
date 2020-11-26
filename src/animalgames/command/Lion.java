package animalgames.command;

public class Lion extends Animal
{
	int ak = (int)(Math.random()*5)+1;
	int jk = (int)(Math.random()*10)+1;
	public Lion(String a) {
		type = "ʨ��";
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
    		System.out.printf("ʨ��" + name + "δ�μ���α���\n");
    	}
    	else {
	        System.out.println("ʨ��"+name+"�ĳɼ���"+result[item-1]);
	        score = result[item-1];
    	}
    }

}