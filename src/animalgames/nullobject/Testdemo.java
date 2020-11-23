package null_object;
import java.util.Scanner;

public class Testdemo {
	public Testdemo(){
		System.out.println("动物种类有rabbit,deer,cat,tortoise");
		AnimalBreedFactory.insertBreed("rabbit");
		AnimalBreedFactory.insertBreed("tortoise");
		AnimalBreedFactory.insertBreed("deer");
		AnimalBreedFactory.insertBreed("cat");
		System.out.println("现在分别创建一个rabbit和一个cat种类的动物对象");
		AbstractAnimal a1=AnimalBreedFactory.getAnimal("rabbit");
		AbstractAnimal a2=AnimalBreedFactory.getAnimal("cat");
		System.out.println(a1.getBreed());
		System.out.println(a2.getBreed());
		System.out.println("现在若将deer从物种名单中移除，再创建该对象有如下结果：");
		AnimalBreedFactory.removeBreed("deer");
		AbstractAnimal a3=AnimalBreedFactory.getAnimal("deer");
		System.out.println(a3.getBreed());
		System.out.println("请输入一个物种名称，将其加入物种名单：");
		Scanner s= new Scanner(System.in);
		String name=s.next();
		AnimalBreedFactory.insertBreed(name);
		System.out.println("请输入一个物种名称，创建该物种的一个动物对象：");
		String name2=s.next();
		AbstractAnimal a4=AnimalBreedFactory.getAnimal(name2);
		System.out.println(a4.getBreed());
		s.close();
		
		//如果在物种列表中删除某个物种，已经创建的该物种对象不会改为null
	}
	
}
