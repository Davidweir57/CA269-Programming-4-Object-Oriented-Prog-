/*
    This code is supplied and may be used to solve this problem.
*/
import java.util.Scanner;

public class HiCounter
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a phrase: ");
        // Read in the word
        String word = in.next();

        // YOUR CODE HERE
        int counter=0;
        for(int i=2; i<= word.length(); i++)
        {
            String pair = word.substring(i-2, i);
            if(pair.equals("hi"))
            {
                counter++;
            }
        }
        System.out.println(counter);
    }
}