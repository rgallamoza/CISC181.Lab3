package pkgPokerBLL;
import java.util.UUID;
import java.util.ArrayList;

public class Game
{
	UUID GameID;
	UUID TableID;
	ArrayList<Player> GamePlayers =  new ArrayList<Player>();
	
	public Game(UUID tableID)
	{
		this.GameID = UUID.randomUUID();
		this.TableID = tableID;
		this.GamePlayers =  new ArrayList<Player>();
	}

	public UUID getGameID()
	{
		return GameID;
	}

	public void setGameID(UUID gameID)
	{
		GameID = gameID;
	}

	public UUID getTableID()
	{
		return TableID;
	}

	public void setTableID(UUID tableID)
	{
		TableID = tableID;
	}

	public ArrayList<Player> getGamePlayers()
	{
		return GamePlayers;
	}

	public void setGamePlayers(ArrayList<Player> gamePlayers)
	{
		GamePlayers = gamePlayers;
	}
	
	public void AddPlayerToGame(Table t, Player p)
	{
		t.AddPlayerToTable(p);
	}
}