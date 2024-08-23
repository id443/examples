package паттерны.поведенческие.шаблонныйМетод;

public class Chess extends Game {

	@Override
	protected void initializeGame() {
		System.out.println("Начали шахматы");
	}

	@Override
	protected void playGame() {
		System.out.println("Играем в шахматы");
	}

	@Override
	protected void endGame() {
        System.out.println("Закончили играть в шахматы");
    }

	@Override
	protected void printWinner() {
		System.out.println("Победитель в шахматы");
	}

}
