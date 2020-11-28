package animalgames.mvc;

public class souvenirView {
	// 显示纪念品详细信息
	public void printsouvenirDetails(int id, String name){
		var out = System.out;
		out.println("souvenir: ");
		out.println("id: " + id);
		out.println("name: " + name);
		out.println();
	}
}
