package animalgames.chainofresponsibility;

public class JudgmentLogger extends AbstractLogger{
	//���еĸ�ʾ��
	protected void write(String message) {
		System.out.println("Judgment::Logger: " + message);
	}
	public JudgmentLogger(int level) {
		this.level=level;
	}
}
