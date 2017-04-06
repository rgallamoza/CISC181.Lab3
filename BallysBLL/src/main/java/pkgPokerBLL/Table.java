package pkgPokerBLL;

import java.util.HashMap;
import java.util.UUID;

public class Table {

	private UUID TableID;
	
	//	Change this from ArrayList to HashMap.
	HashMap<UUID, String> TablePlayers = new HashMap<UUID,String>();
	
	public Table() {
		super();
		TableID = UUID.randomUUID();
	}
	
	public Table AddPlayerToTable(Player p)
	{
		TablePlayers.put(p.getPlayerID(), p.getPlayerName());	
		return this;
	}
	
	public Table RemovePlayerFromTable(Player p)
	{
		TablePlayers.remove(p.getPlayerID(),p.getPlayerName());
		return this;
	}
}