package animalgames.mvc;

public class AnimalView {
	// 显示动物详细信息
	public void printAnimalDetails(int id, String name){
		var out = System.out;
		out.println("Animal: ");
		out.println("id: " + id);
		out.println("name: " + name);
		out.println();
	}
}
