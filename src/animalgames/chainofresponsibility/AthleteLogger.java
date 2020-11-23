package chain_of_responsibility;

public class AthleteLogger extends AbstractLogger{
	public void write(String message) {
		System.out.println("Athelete::Logger: " + message);
	}
	public AthleteLogger(int level) {
		this.level=level;
	}
}

