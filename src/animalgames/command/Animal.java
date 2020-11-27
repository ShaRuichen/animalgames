package animalgames.command;

//抽象观察者
abstract class Animal
{
  abstract void response(int[] result); //反应
  protected int countA = 0;//金牌 
  protected int countB = 0;//银牌 
  protected int countC = 0;//铜牌 
  protected String type;
  
  public int Swimminglevel;
  public int Runninglevel;
  
  protected int level;
	protected int item = -1; //本人编号
	protected String name;
	protected int score; //当前名次
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
			System.out.printf(name +"获得了金牌\n");
			countA++;
		}
		else if(score == 2) {
			System.out.printf(name +"获得了银牌\n");
			countB++;
		}
		else if(score ==3) {
			System.out.printf(name +"获得了铜牌\n");
			countC++;
		}
		else {
			System.out.printf(name +"没有获得奖牌\n");
		}
	}
	public void Summary() {
		System.out.printf(name + "获得" + countA + "枚金牌" + " " + countB + "枚银牌" + " " + countC + "枚铜牌\n");
	}
}