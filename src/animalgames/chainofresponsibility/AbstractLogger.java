package animalgames.chainofresponsibility;

public abstract class AbstractLogger {
	 public static int  JUDGMENT= 1;
	   public static int ATHLETE = 2;
	   public static int ALL = 3;
	 //三种类型的消息
	   protected int level;//接收哪种类型的消息
	 
	   //责任链中的下一个元素
	   protected AbstractLogger nextLogger;
	 
	   public void setNextLogger(AbstractLogger nextLogger){
	      this.nextLogger = nextLogger;
	   }//设置责任链中的下一个元素
	 
	   public void logMessage(int level, String message){
	      if(this.level <= level){//如果可接收，则展示消息
	         write(message);
	      }
	      if(nextLogger !=null){//如果有下一个元素就传递
	         nextLogger.logMessage(level, message);
	      }
	   }
	 
	   abstract protected void write(String message);
}
