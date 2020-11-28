package animalgames.dataaccessobject;

import java.util.List;

public interface PlayerDao {
	public List<Player> getAllPlayers();
	public Player getPlayer(int id);
	public void updatePlayer(Player player);
	public void deletePlayer(Player player);
}
