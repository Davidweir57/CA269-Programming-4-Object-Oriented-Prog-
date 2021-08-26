import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti3
{
    public static void main(String [] args)
    {
        try
        {
            Scanner words = new Scanner(new File(args[0]));
            int inRev=0;
            double total=0;

            while(words.hasNext())
            {
                Scanner reviews = new Scanner(new File(args[1]));
                String word = words.next();

                total=0; inRev=0;

                while(reviews.hasNext())
                {
                    String line = reviews.nextLine();
                    String [] review = line.substring(2, line.length()).split(" ");
    
                    // if(line.contains(word))
                    // {
                    //     total = total + Integer.parseInt(line.substring(0, 1));
                    //     inRev++;
                    // }

                    for(int i=0; i<review.length-1; i++)
                    {
                        if(word.equals(review[i]))
                        {
                            total = total + Integer.parseInt(line.substring(0, 1));
                            inRev++;
                        }
                    }
                }

                double average = total / inRev;

                if(inRev == 0)
                {
                    System.out.println("The score of " + word + " is 0.00.");
                }
                else
                {
                    System.out.println("The score of " + word + " is " + String.format("%.2f", average) + ".");
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: File not found.");
        }
    }
}