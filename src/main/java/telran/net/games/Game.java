package telran.net.games;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "game")
public class Game {

	@Id
    private int id;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "sequence")
	private String sequence;
	
	@Column(name = "isWinner")
	private Boolean isWinner;
	
	
	public Game() {}
	
	public Game(int id, Date date, String sequence, Boolean isWinner) {
		this.id = id;
		this.date = date;
		this.sequence = sequence;
		this.isWinner = isWinner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public Boolean isWinner() {
		return isWinner;
	}

	public void setWinner(Boolean isWinner) {
		this.isWinner = isWinner;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", date=" + date + ", sequence=" + sequence + ", isWinner=" + isWinner + "]";
	}

}