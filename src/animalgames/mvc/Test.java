package animalgames.mvc;

import animalgames.Entry;

public class Test {
	// 测试函数
	@Entry(title = "管理纪念品信息")
	public static void test() {
		var model = new souvenir();
		model.setId(100);
		model.setName("泰哥");
		var view = new souvenirView();
		var controller = new souvenirController(model, view);
		controller.updateView();
		System.out.println();
		controller.setsouvenirName("小泰哥");
		controller.updateView();
	}
}
