// Write your Hangman class here
import java.util.Scanner;

public class Hangman
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // First get the word
        int wordSeed = in.nextInt();

        String word = Word.getWord(wordSeed);

        System.out.println("The word is");
        String fullguess = "";
        System.out.println(Word.showLetters(word, fullguess));

        // Now you have the word ... encourage the user to guess.
        boolean end = Word.allDone(word, fullguess);
        String guesstmp = in.nextLine();

        while(end != true && in.hasNextLine())
        {
            String guess = in.nextLine();
            fullguess = fullguess + guess;

            System.out.println("Guess a letter:");
            System.out.println(Word.showLetters(word, fullguess));

            end = Word.allDone(word, fullguess);
        }

        System.out.println("Well Done, the word was " + word + ".");
    }
}
