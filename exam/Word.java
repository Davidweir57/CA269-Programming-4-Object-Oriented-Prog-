// Create a Word class with one static method called howManyCorrect
public class Word
{

    public static boolean contains(String guesses, char letter)
    {
        for(int i=0; i<guesses.length(); i++)
        {
            if (guesses.charAt(i) == letter)
            {
                return true;
            }
        }

        return false;
    }

    public static int howManyCorrect(String word, String guess)
    {
        int total = 0;

        for(int i=0; i<word.length(); i++)
        {
            if(contains(guess, word.charAt(i)))
            {
                total++;
            }

        }

        return total;
    }
}