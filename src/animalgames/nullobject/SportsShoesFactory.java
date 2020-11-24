package null_object;

import java.util.ArrayList;
import java.util.Iterator;

public class SportsShoesFactory {
	public static ArrayList<String>  breeds = new ArrayList<String>();//Ʒ���嵥
	
	public static AbstractSportsShoes get(String breedname) {//����ĳƷ�ֶ������
		Iterator<String> iter= breeds.iterator();
		while(iter.hasNext()) {//����
			if(iter.next().equalsIgnoreCase(breedname)) {
				return new RealSportsShoes(breedname);
			}
		}
			return new NullSportsShoes();
	}
	
	public static void insert(String breedname) {//����
		breeds.add(breedname);
	}
	
	public static boolean remove(String breedname) {//ɾ��
		Iterator<String> iter= breeds.iterator();
		int index=0;
		while(iter.hasNext()) {//����
			if(iter.next().equalsIgnoreCase(breedname)) {
				break;
			}
			index++;
		}
		if(index<breeds.size()) {
			breeds.remove(index);
			return true;//�ɹ�
		}
		else 
			return false;
	}
}
