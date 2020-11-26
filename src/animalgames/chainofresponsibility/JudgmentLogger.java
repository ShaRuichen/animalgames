package chain_of_responsibility;

public class JudgmentLogger extends AbstractLogger{
	protected void write(String message) {
		System.out.println("Judgment::Logger: " + message);
	}
	public JudgmentLogger(int level) {
		this.level=level;
	}
}
