package animalgames.chainofresponsibility;

public class AthleteLogger extends AbstractLogger{
	//运动员的告示板
	public void write(String message) {
		System.out.println("Athelete::Logger: " + message);
	}
	public AthleteLogger(int level) {
		this.level=level;
	}
}

