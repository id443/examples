package паттерны.поведенческие.шаблонныйМетод;

public class GamesManager {
    public static void main (String [] args){
		final GameCode gameCode = GameCode.CHESS;
		
		Game game;
		
		switch (gameCode){
			case CHESS : 
				game = new Chess();  
				break;
			case MONOPOLY : 
				game = new Monopoly();  
				break;
			default :
				throw new IllegalStateException();
		}
		
		game.playOneGame(2);
	}
}
