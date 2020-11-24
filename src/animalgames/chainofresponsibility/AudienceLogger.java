package animalgames.chainofresponsibility;

public class AudienceLogger extends AbstractLogger{
	//观众的告示板
	protected void write(String message) {
		System.out.println("Audience::Logger: " + message);
	}
	public AudienceLogger(int level) {
		this.level=level;
	}
}
