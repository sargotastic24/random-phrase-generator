# random-phrase-generator

Random Phrase Generator

This program generates random phrases based on a provided grammar file using a recursive descent parser.

Problem

In video games, characters often need to say phrases with specific structures. This program generates random phrases following the rules defined in an input grammar file.

Input Grammar File Format

The grammar file specifies the structure of valid phrases using non-terminals (enclosed in angle brackets) and terminals (plain text). Each non-terminal is defined by a set of productions (alternative expansions), where productions can include other non-terminals and terminals. The format is strict:

- Non-terminals: <non_terminal_name> (no spaces)
- Terminals: Regular text
- Productions: One per line, consist of terminals/non-terminals separated by spaces.
- Comments: Lines outside curly braces are ignored.
- Every non-terminal must be defined, and the starting non-terminal is always <start>.

Example Grammar File (super_simple.g):

{
  <sentence>
    <noun> <verb> <object>
  }
  <noun>
    The cat
    The mouse
  }
  <verb>
    sat
    stood on
  }
  <object>
    the mat
    the dog
  }
}
Requirements

1) RandomPhraseGenerator Class:
Located in the comprehensive package. It serves as the program's entry point (containing the main method).

2) Additional Classes:
Create necessary classes (e.g., GrammarParser, GrammarNode, etc.) to handle grammar parsing, random phrase generation, and data structures.

3) Command-Line Arguments:
- The program accepts two command-line arguments:
- Input grammar file path (first argument)
- Number of phrases to generate (second argument)

4) Output:
Print each generated phrase on a separate line, preserving whitespace from the grammar file.

Efficiency Considerations:
- Employ memoization techniques to cache parsed non-terminals for reuse during recursive calls, potentially improving efficiency for complex grammars.
- Consider using a more efficient random number generator (e.g., ThreadLocalRandom) to improve randomness in frequent generation scenarios.

Running the Program

- Ensure the grammar file and comprehensive package are in the working directory.
- Open a terminal and navigate to the working directory.
- Run the program with command-line arguments, for example:

java comprehensive/RandomPhraseGenerator poetic_sentence.g 5

This generates 5 random phrases based on the poetic_sentence.g grammar file.

Evaluation

The program's efficiency will be assessed primarily based on running time. Consider using techniques mentioned in the "Efficiency Considerations" section to optimize performance for larger grammar files and phrase generation counts.
