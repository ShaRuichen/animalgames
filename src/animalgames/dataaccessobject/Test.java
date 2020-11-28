package animalgames.dataaccessobject;

import animalgames.Entry;

public class Test {
	// 测试函数
	@Entry(title = "管理运动员信息")
	public static void test() {
		var out = System.out;
		var playerDao = new PlayerDaoImpl();
		for (var player : playerDao.getAllPlayers()) {
	         out.println("Player: [id : " + player.getId() + ", name : " + player.getName() + " ]");
	    }
		var player = playerDao.getAllPlayers().get(0);
	    player.setName("Michael");
	    playerDao.updatePlayer(player);
	    playerDao.getPlayer(0);
	    out.println("Player: [id : " + player.getId() + ", name : " + player.getName() + " ]"); 
	}
}
