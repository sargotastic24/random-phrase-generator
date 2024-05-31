package comprehensive;

/**
 * 
 * @author Sarthak Goyal
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class GetFile {
	
	private String name;
	public final HashMap<String, ArrayList<String>> file;
	
	/**
	 * Constructor that takes all the strings read in from the given file, stores into a HashMap.
	 * @param fileName
	 */
	public GetFile(String fileName) {
		file = new HashMap<String, ArrayList<String>>();
		name = fileName;
	}
	
	/**
	 * Stores the strings from the file into a hashmap, accounting for terminals and non terminals<>.
	 * Hash table contains a nonterminal<> -> terminal relationship.
	 */
	public void grammarFile() {
		
		Scanner s = null;
		try {
			s = new Scanner(new File(name));
		}
		
		catch(FileNotFoundException exception) {
			System.out.println("File non existent");	
		}
		while(s.hasNext()) {
			String l = s.nextLine();
			if(l.equals("{")) {
				
				String nonTerminal = s.nextLine();
				file.put(nonTerminal, new ArrayList<String>());
				ArrayList<String> terminals = (ArrayList<String>) file.get(nonTerminal);
				
				while(s.hasNext()) {
					String terminal = s.nextLine();
					
					if(terminal.equals("}")) {
						break;
					}
					
					terminals.add(terminal);
				}
			}
		}
	}
}
