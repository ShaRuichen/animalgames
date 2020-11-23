package chain_of_responsibility;

//Ӧ���ڴ���Animal��ʱ��set����logger
//���ݹ��ڲ��л����˶�Ա������
//���ֶ�����ÿ��animal����һ��logger
//��һ����һ����һ���Ľ�ɫ
//��realAnimal���Ѿ�������lastLogger����˲���

//������Ϣ��ʱ���������º�������

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