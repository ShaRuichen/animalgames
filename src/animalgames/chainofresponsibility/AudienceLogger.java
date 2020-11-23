package chain_of_responsibility;

public class AudienceLogger extends AbstractLogger{
	protected void write(String message) {
		System.out.println("Audience::Logger: " + message);
	}
	public AudienceLogger(int level) {
		this.level=level;
	}
}
