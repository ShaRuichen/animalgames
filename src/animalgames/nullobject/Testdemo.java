package null_object;
import java.util.Scanner;

public class Testdemo {
	public Testdemo(){
		System.out.println("����������rabbit,deer,cat,tortoise");
		AnimalBreedFactory.insertBreed("rabbit");
		AnimalBreedFactory.insertBreed("tortoise");
		AnimalBreedFactory.insertBreed("deer");
		AnimalBreedFactory.insertBreed("cat");
		System.out.println("���ڷֱ𴴽�һ��rabbit��һ��cat����Ķ������");
		AbstractAnimal a1=AnimalBreedFactory.getAnimal("rabbit");
		AbstractAnimal a2=AnimalBreedFactory.getAnimal("cat");
		System.out.println(a1.getBreed());
		System.out.println(a2.getBreed());
		System.out.println("��������deer�������������Ƴ����ٴ����ö��������½����");
		AnimalBreedFactory.removeBreed("deer");
		AbstractAnimal a3=AnimalBreedFactory.getAnimal("deer");
		System.out.println(a3.getBreed());
		System.out.println("������һ���������ƣ������������������");
		Scanner s= new Scanner(System.in);
		String name=s.next();
		AnimalBreedFactory.insertBreed(name);
		System.out.println("������һ���������ƣ����������ֵ�һ���������");
		String name2=s.next();
		AbstractAnimal a4=AnimalBreedFactory.getAnimal(name2);
		System.out.println(a4.getBreed());
		s.close();
		
		//����������б���ɾ��ĳ�����֣��Ѿ������ĸ����ֶ��󲻻��Ϊnull
	}
	
}
