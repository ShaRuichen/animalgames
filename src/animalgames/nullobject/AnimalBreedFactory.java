package null_object;

import java.util.ArrayList;
import java.util.Iterator;

public class AnimalBreedFactory {
	public static ArrayList<String>  breeds = new ArrayList<String>();//品种清单
	
	public static AbstractAnimal getAnimal(String breedname) {//创建某品种动物对象
		Iterator<String> iter= breeds.iterator();
		while(iter.hasNext()) {//遍历
			if(iter.next().equalsIgnoreCase(breedname)) {
				return new RealAnimal(breedname);
			}
		}
			return new NullAnimal();
	}
	
	public static void insertBreed(String breedname) {//插入
		breeds.add(breedname);
	}
	
	public static boolean removeBreed(String breedname) {//删除
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
