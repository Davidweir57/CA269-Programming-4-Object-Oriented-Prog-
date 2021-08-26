import java.util.*;

public class Word
{
    // Create a Word class with one static method called isFirstLetter
    public static boolean isFirstLetter(String word, char letter)
    {
        return word.charAt(0) == letter;
    }

    // Create a Word class with one static method called containsLetter
    public static boolean containsLetter(String word, char letter)
    {
        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i) == letter)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean allDone(String word, String guess)
    {
        char letters[] = word.toCharArray();
        int count=0;
        for(int i=0; i<letters.length; i++)
        {
            if(containsLetter(guess, letters[i]))
            {
                count++;
                continue;
            }
        }
        if(count == word.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Create a Word class with one static method called showLetter
    public static String showLetter(String word, char guess)
    {
        String str = "";

        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i) == guess)
            {
                str = str + guess;   
            }
            else
            {
                str = str + "_";
            }
        }

        return str;
    }

    // Create a Word class with one static method called showLetters
    public static String showLetters(String word, String guesses)
    {
        String str = "";

        for(int i=0; i<word.length(); i++)
        {
            if(containsLetter(guesses, word.charAt(i)))
            {
                str = str + word.charAt(i);   
            }
            else
            {
                str = str + "_";
            }
        }

        return str;
    }
}
