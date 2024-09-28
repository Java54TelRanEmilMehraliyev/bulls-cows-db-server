package telran.net.games.exceptions;

@SuppressWarnings("serial")
public class GameNotStartedException extends IllegalStateException{
	public GameNotStartedException (long gameId) {
		super("Not started game yet " + gameId);
	}

}
