package animalgames.chainofresponsibility;

public class AudienceLogger extends AbstractLogger{
	//���ڵĸ�ʾ��
	protected void write(String message) {
		System.out.println("Audience::Logger: " + message);
	}
	public AudienceLogger(int level) {
		this.level=level;
	}
}
