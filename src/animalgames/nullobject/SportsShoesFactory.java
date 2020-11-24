package null_object;

import java.util.ArrayList;
import java.util.Iterator;

public class SportsShoesFactory {
	public static ArrayList<String>  breeds = new ArrayList<String>();//品种清单
	
	public static AbstractSportsShoes get(String breedname) {//创建某品种动物对象
		Iterator<String> iter= breeds.iterator();
		while(iter.hasNext()) {//遍历
			if(iter.next().equalsIgnoreCase(breedname)) {
				return new RealSportsShoes(breedname);
			}
		}
			return new NullSportsShoes();
	}
	
	public static void insert(String breedname) {//插入
		breeds.add(breedname);
	}
	
	public static boolean remove(String breedname) {//删除
		Iterator<String> iter= breeds.iterator();
		int index=0;
		while(iter.hasNext()) {//遍历
			if(iter.next().equalsIgnoreCase(breedname)) {
				break;
			}
			index++;
		}
		if(index<breeds.size()) {
			breeds.remove(index);
			return true;//成功
		}
		else 
			return false;
	}
}
