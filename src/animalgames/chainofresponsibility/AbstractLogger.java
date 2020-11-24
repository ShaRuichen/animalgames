package animalgames.chainofresponsibility;

public abstract class AbstractLogger {
	 public static int  JUDGMENT= 1;
	   public static int ATHLETE = 2;
	   public static int ALL = 3;
	 //�������͵���Ϣ
	   protected int level;//�����������͵���Ϣ
	 
	   //�������е���һ��Ԫ��
	   protected AbstractLogger nextLogger;
	 
	   public void setNextLogger(AbstractLogger nextLogger){
	      this.nextLogger = nextLogger;
	   }//�����������е���һ��Ԫ��
	 
	   public void logMessage(int level, String message){
	      if(this.level <= level){//����ɽ��գ���չʾ��Ϣ
	         write(message);
	      }
	      if(nextLogger !=null){//�������һ��Ԫ�ؾʹ���
	         nextLogger.logMessage(level, message);
	      }
	   }
	 
	   abstract protected void write(String message);
}
