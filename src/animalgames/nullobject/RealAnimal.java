package null_object;

import chain_of_responsibility.AbstractLogger;

public class RealAnimal extends AbstractAnimal{
	public RealAnimal(String name) {
		this.breed=name;
	}
	
	@Override
	public String getBreed() {
		return breed;
	}
	
	@Override
	public boolean isNil() {
		return false;
	}
	
	protected AbstractLogger logger;//模式chain_of_resposibility(还有strategy)
	public static AbstractLogger lastlogger;
	public void setLogger(AbstractLogger logger) {
		this.logger=logger;
		lastlogger=this.logger;
	}
	
	public AbstractLogger getLogger() {
		return logger;
	}
}
