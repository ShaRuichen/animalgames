package animalgames.command;

import java.util.ArrayList;
import java.util.List;

abstract class Race
{   
	protected List<Animal> name;
    public abstract int[] strategyMethod();    //�����������ĳ����ཫ����д
    protected int result[];//�����Ľ��
	int i = 0;//��ǰ�˶�Ա����
	int num = 0;//������
    public Race() {
    	name=new ArrayList<Animal>();//�μӱ���������
    }
	//¼���˶�Ա
	public void add(Animal obs) {
		name.add(obs);
		i++;
		num++;
		System.out.printf("¼��"+obs.getName()+"�ɹ�����ǰ����:"+i +"��ǰ����������:"+num+"\n");
		obs.setNum(i);
	}
	//ɾ���˶�Ա
	public void remove(Animal aa) {
		name.remove(aa);
		num--;
		System.out.printf("ɾ���ɹ�����ǰ����:",i ,"��ǰ����������:",num);
	}
	
	//���
	public int[] getRe() {
		return result;
	}
	
}
