import java.util.Arrays;

public class Anagrama {
    public static void main(String[] args) {
        String[] stringArray = { "weddw", "cew", "ghr", "kov", "wev" };
        String initialWord = "wce";
        char[] word = initialWord.toCharArray();
        Arrays.sort(word);
        char[] secondWord;

        for (int i = 0; i < stringArray.length; i++)
            if (initialWord.length() == stringArray[i].length()) {
                secondWord = stringArray[i].toCharArray();
                Arrays.sort(secondWord);
                if (Arrays.equals(word, secondWord))
                    System.out.println(stringArray[i]);
            }
    }
}
