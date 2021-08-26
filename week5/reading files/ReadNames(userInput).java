import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNames
{
    public static void main(String [] args)
    {
        try
        {
            Scanner in = new Scanner(System.in);
            
            System.out.print("Enter the file name: ");
            String file = in.next();

            in = new Scanner(new File(file));
            int numNames = in.nextInt();
            String [] names = new String[numNames];

            for(int i=0; i < numNames; i++)
            {
                names[i] = in.next();
            }

            System.out.println("The names in reverse order are:");

            for(int i = numNames-1; i >=0; i--)
            {
                System.out.print(names[i] + " ");
            }

            System.out.println();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("This file cannot be found.");
        }
    }
}