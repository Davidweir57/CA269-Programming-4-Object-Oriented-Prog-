import java.util.Scanner;

public class TestAllDone
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user for a word and a letter
        System.out.print("Enter a word and a letter: ");
        String word = in.next();
        String guessed = in.next();
        
        if(Word.allDone(word, guessed))
            System.out.println("You got all the letters!");
        else
            System.out.println("Keep guessing!");
    }
}