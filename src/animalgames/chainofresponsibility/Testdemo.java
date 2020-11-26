package chain_of_responsibility;

//应该在创建Animal的时候set它的logger
//根据观众裁判还是运动员的属性
//并手动设置每个animal的下一个logger
//下一个不一定是一样的角色
//在realAnimal中已经设置了lastLogger方便此操作

//发送消息的时候类似如下函数操作

public class Testdemo {
	public Testdemo() {
		AbstractLogger l1 = new AudienceLogger(AbstractLogger.ERROR);
	      AbstractLogger l2= new AthleteLogger(AbstractLogger.DEBUG);
	      AbstractLogger l3= new JudgmentLogger(AbstractLogger.INFO);
	 
	      l1.setNextLogger(l2);
	      l2.setNextLogger(l3);
	      
	      l1.logMessage(AbstractLogger.INFO, "This is an information.");
	      
	      
	}
}