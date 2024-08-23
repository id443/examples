package паттерны.поведенческие.шаблонныйМетод;

public class Monopoly extends Game{

	@Override
	protected void initializeGame() {
		System.out.println("Начали монополию");
	}

	@Override
	protected void playGame() {
		System.out.println("Играем в  монополию");
	}

	@Override
	protected void endGame() {
		System.out.println("Закончили монополию");
	}

	@Override
	protected void printWinner() {
		System.out.println("Победитель монополии");
	}

}

