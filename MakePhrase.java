package comprehensive;

/**
 * @author Sarthak Goyal
 */

import java.util.Random;

public class MakePhrase {
	
	private final GetFile input;
	private final Random random;
	private int phraseCount;
	
	/**
	 * Constructor for making the phrase. Takes a string grammar file and an integer for how many phrases to produce.
	 * @param grammarFile
	 * @param count
	 */
	public MakePhrase(String grammarFile, int count) {
		input = new GetFile(grammarFile);
		input.grammarFile();
		random = new Random();
		phraseCount = count;
	}
	/**
	 * Method that generates the random phrases based on a the constraints of terminals and non terminals<>.
	 */
	public void makePhrases() {
		for(int i = 0; i < phraseCount; i++) {
			
			StringBuilder s = new StringBuilder();
			s.append(input.file.get("<start>").get(0));
			
			while(s.indexOf("<") != -1) {
				
				int termFirst = s.indexOf("<");
				int termLast = s.indexOf(">") + 1;
				String nonTerminal = (String) s.substring(termFirst, termLast);
				
				if(termLast > termFirst) {
					int rand = random.nextInt(input.file.get(nonTerminal).size());
					s.replace(termFirst, termLast, (String) input.file.get(nonTerminal).get(rand));
				}
			}
			System.out.println(s);
		}
	}
	

}
