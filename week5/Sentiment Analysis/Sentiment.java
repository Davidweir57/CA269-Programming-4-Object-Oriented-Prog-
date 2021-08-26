import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Sentiment
{

    public static void main(String [] args)
    {
        System.out.println(Sentiment.sentiment("This it was very good.", "review.txt"));
    }

    public static double sentiment(String review, String reviewFilename)
    {
        // The review does not have a rating (i.e. a score).
        // This method will rate the review by finding the score for each of the words
        // and averaging them together.

        try
        {
            String [] review2 = review.split(" ");
            double total=0;
            double wordScore=0;
            double count=0;

            Scanner reviews = new Scanner(new File(reviewFilename));

            for(int i=0; i<review2.length; i++)
            {
                wordScore=0; count=0;

                String word = review2[i];

                while(reviews.hasNextLine())
                {
                    String line = reviews.nextLine();
                    String [] sentence = line.substring(0, line.length()).split(" ");

                    for(String w : sentence)
                    {
                        if(w.equals(word))
                        {
                            wordScore = wordScore + Double.parseDouble(sentence[0]);
                            count++;
                        }
                    }
                }

                if(count> 0 && wordScore/count < 1.8 || wordScore >= 2.2)
                {
                    total = total + (wordScore / count);
                }

                reviews = new Scanner(new File(reviewFilename));

            }

            if(total == 0)
            {
                return -1;
            }
            else
            {
                double average = total / review2.length;
                return average;
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: File not found.");
        }

        return 0;
    }
}
