import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti1
{
    public static void main(String [] args) throws FileNotFoundException
    {
        try
        {
            File fileReviews = new File(args[1]);
            Scanner reviews = new Scanner(fileReviews);
            String toCount = args[0];

            int counter=0;
            while(reviews.hasNext())
            {
                // Now you can read in a line with Scanner's nextLine() method and you can
                // read in an int with the nextInt() method.
                String word = reviews.next();

                if(word.contains(toCount))
                {
                    counter++;
                }

            }

            System.out.println(toCount + " appears " + counter + " times.");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: File not found.");
        }
    }   
}