package паттерны.структурные.приспособленец2;
public class CharacterB extends EnglishCharacter {

	public CharacterB(){
		symbol = 'B';
		width = 20;
		height = 30;
	}
	
	@Override
	public void printCharacter() {
		System.out.println("Symbol = " + symbol + " Width = " + width + " Height = " + height);
	}
	
}
