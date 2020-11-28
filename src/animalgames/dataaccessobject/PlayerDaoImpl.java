package animalgames.dataaccessobject;

import java.util.ArrayList;
import java.util.List;

public class PlayerDaoImpl implements PlayerDao {
	private List<Player> players;
	
	public PlayerDaoImpl() {
		players = new ArrayList<Player>();
		var player1 = new Player();
		player1.setId(0);
		player1.setName("泰哥");
		var player2 = new Player();
		player2.setId(1);
		player2.setName("莱恩");
		players.add(player1);
		players.add(player2);
	}
	
	// 删除运动员
	@Override
	public void deletePlayer(Player player) {
		players.remove(player.getId());
		System.out.println("Animal: Id " + player.getId() +", deleted from database");
	}
	
	// 获取所有运动员
	@Override
	public List<Player> getAllPlayers() {
		return players;
	}
	
	// 获取运动员
	@Override
	public Player getPlayer(int id) {
	      return players.get(id);
	}
	
	// 更新运动员
	@Override
	public void updatePlayer(Player player) {
	      players.get(player.getId()).setName(player.getName());
	      System.out.println("Player: id " + player.getId() +", updated in the database");
	}
}
