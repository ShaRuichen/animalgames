package animalgames.mvc;

import animalgames.Entry;

public class Test {
	// 测试函数
	@Entry(title = "管理动物信息")
	public static void test() {
		var model = new Animal();
		model.setId(100);
		model.setName("泰哥");
		var view = new AnimalView();
		var controller = new AnimalController(model, view);
		controller.updateView();
		System.out.println();
		controller.setAnimalName("小泰哥");
		controller.updateView();
	}
}
