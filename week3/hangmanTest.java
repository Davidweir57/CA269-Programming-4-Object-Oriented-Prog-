// Write your Hangman class here
import java.util.Scanner;

public class hangmanTest
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // First get the word
        // int wordSeed = in.nextInt();

        // String word = Word.getWord(wordSeed);
        String word = "dog";
        String allGuesses = "";
        
        System.out.println("The word is");
        String result = Word.showLetters(word, allGuesses);
        System.out.println(result);
        
        String shite = in.nextLine();
        // Now you have the word ... encourage the user to guess.
        boolean finished = Word.allDone(word, allGuesses);
        
        while(finished != true)
        {   
            System.out.println("Guess a letter:");
            String guess = in.nextLine();
            allGuesses = allGuesses + guess;
            
            String newresult = Word.showLetters(word, allGuesses);
            
            System.out.println(newresult);
            
            finished = Word.allDone(word, allGuesses);
        }
        System.out.println("Well Done, the word was " + word + ".");
    }
}