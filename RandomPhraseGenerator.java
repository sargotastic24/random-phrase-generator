package comprehensive;

/**
 * 
 * @author Sarthak Goyal
 *
 */

public class RandomPhraseGenerator {

	public static void main(String[] args) {
		String file = new String(args[0]);
		MakePhrase phr = new MakePhrase(file, Integer.parseInt(args[1]));
		phr.makePhrases();
		
		
	}
		
}
