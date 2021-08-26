import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti2
{
    public static void main(String [] args)
    {
        try
        {
            Scanner reviews = new Scanner(new File(args[1]));
            String word = args[0];
            int inRev=0;
            double total=0;

            while(reviews.hasNextLine())
            {
                String review = reviews.nextLine();

                if(review.contains(word))
                {
                    total = Integer.parseInt(review.substring(0, 1));
                    inRev++;
                }
            }

            double average = total / inRev;
            System.out.println(word + " appears " + inRev + " times.");
            System.out.println("The average score of the reviews containing " + word + " is " + average);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: File not found.");
        }
    }
}