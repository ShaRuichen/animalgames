package animalgames.command;

//����۲���
abstract class Animal
{
  abstract void response(int[] result); //��Ӧ
  protected int countA = 0;//���� 
  protected int countB = 0;//���� 
  protected int countC = 0;//ͭ�� 
  protected String type;
  
  public int Swimminglevel;
  public int Runninglevel;
  
  protected int level;
	protected int item = -1; //���˱��
	protected String name;
	protected int score; //��ǰ����
	public int getSw() {
		return Swimminglevel;
	}
	public int getRn() {
		return Runninglevel;
	}
	public String getTy() {
		return type;
	}
	public void setNum(int h) {
		item = h;
	}
	public String getName() {
		return name;
	}
	
	public void action() {
		// TODO Auto-generated method stub
		if(score == 1) {
			System.out.printf(name +"����˽���\n");
			countA++;
		}
		else if(score == 2) {
			System.out.printf(name +"���������\n");
			countB++;
		}
		else if(score ==3) {
			System.out.printf(name +"�����ͭ��\n");
			countC++;
		}
		else {
			System.out.printf(name +"û�л�ý���\n");
		}
	}
	public void Summary() {
		System.out.printf(name + "���" + countA + "ö����" + " " + countB + "ö����" + " " + countC + "öͭ��\n");
	}
}