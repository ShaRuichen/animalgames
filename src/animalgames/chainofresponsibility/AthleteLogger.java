package animalgames.chainofresponsibility;

public class AthleteLogger extends AbstractLogger{
	//�˶�Ա�ĸ�ʾ��
	public void write(String message) {
		System.out.println("Athelete::Logger: " + message);
	}
	public AthleteLogger(int level) {
		this.level=level;
	}
}

