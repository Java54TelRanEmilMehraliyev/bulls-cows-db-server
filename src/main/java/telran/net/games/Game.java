package telran.net.games;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "game")
public class Game {

	@Id
    private int id;
	private String player;
	private int moves;
	private boolean isWinner;
	
	public Game() {}
	
	public Game(int id, String player, int moves, boolean isWinner) {
		this.id = id;
		this.player = player;
		this.moves = moves;
		this.isWinner = isWinner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public int getMoves() {
		return moves;
	}

	public void setMoves(int moves) {
		this.moves = moves;
	}

	public boolean isWinner() {
		return isWinner;
	}

	public void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", player=" + player + ", moves=" + moves + ", isWinner=" + isWinner + "]";
	}
  
}
