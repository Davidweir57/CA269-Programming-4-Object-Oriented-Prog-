import java.util.Scanner;

public class testWord
{
    // generate the alphabet
    static String getAlphabet()
    {
        String alphabet = "";
        for(int i = 0; i < 26; i++)
            alphabet += (char) ('a' + i);
            
        return alphabet;
    }
    
    static boolean contains(String word, char let)
    {
        for(int i = 0; i < word.length(); i++)
            if(word.charAt(i) == let)
                return true;
        return false;
    }
    
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        String alphabet = getAlphabet();
        System.out.println("Enter a word:");
        String word = input.next();
        String guesses = "";    // Start with no guesses
        // First try every second letter in the alphabet
        for(int i = 0; i < alphabet.length(); i += 2)
            {
                guesses += alphabet.charAt(i); // Try this letter
                System.out.println("Word.howManyCorrect(\"" + word + "\", \"" + guesses + "\") = " + Word.howManyCorrect(word, guesses));
            }
            
        // Try the same thing backwards
        guesses = ""; // reset guesses
        for(int i = alphabet.length() - 1; i >= 0; i -= 2)
            {
                guesses += alphabet.charAt(i); // Try this letter
                System.out.println("Word.howManyCorrect(\"" + word + "\", \"" + guesses + "\") = " + Word.howManyCorrect(word, guesses));
            }
        // try no guesses (i.e. empty string)
        guesses = "";
        System.out.println("Word.howManyCorrect(\"" + word + "\", \"" + guesses + "\") = " + Word.howManyCorrect(word, guesses));
        // all letters 
        for(int i = 0; i < alphabet.length(); i++)
            if(contains(word, alphabet.charAt(i)))
                guesses += alphabet.charAt(i); // Try this letter

        System.out.println("Word.howManyCorrect(\"" + word + "\", \"" + guesses + "\") = " + Word.howManyCorrect(word, guesses));
    }
}