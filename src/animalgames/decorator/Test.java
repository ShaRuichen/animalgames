package animalgames.decorator;

import animalgames.Entry;

public class Test {
	// 测试函数
	@Entry(title = "动物踢足球")
	public static void test() {
		var out = System.out;
		var tiger = new Tiger();
		out.println("normal tiger: ");
		tiger.playFootball();
		out.println();
		var tigerGoalkeeper = new AnimalGoalkeeper(tiger);
		out.println("goalkeeper tiger: ");
		tigerGoalkeeper.playFootball();
		out.println();
		var lion = new Lion();
		out.println("normal lion: ");
		lion.playFootball();
		out.println();
		var lionGoalkeeper = new AnimalGoalkeeper(lion);
		out.println("goalkeeper lion: ");
		lionGoalkeeper.playFootball();
		out.println();
	}
}
