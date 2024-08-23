package паттерны.структурные.приспособленец2;

import java.util.HashMap;

public class FlyweightFactory {

	private HashMap<Integer, EnglishCharacter> characters = new HashMap();
	
	public EnglishCharacter getCharacter(int characterCode){
		EnglishCharacter character = characters.get(characterCode);
		if (character == null){
			switch (characterCode){
				case 1 : {
					character = new CharacterA();
					break;
				}
				case 2 : {
					character = new CharacterB();
					break;
				}
				case 3 : {
					character = new CharacterC();
					break;
				}
			}
			characters.put(characterCode, character);
		}
		return character;
	} 
	
}
