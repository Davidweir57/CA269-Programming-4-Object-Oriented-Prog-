import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.io.File;
import java.io.FileNotFoundException;

public class Suspicious
{
    public static void main(String [] args)
    {
        try
        {
            Scanner in = new Scanner(new File(args[0]));
            Set<String> sus = new HashSet<String>();

            while(in.hasNextLine())
            {
                String name = in.nextLine();
                sus.add(name);
            }

            Scanner in2 = new Scanner(new File(args[1]));

            int i=1;

            while(in2.hasNextLine())
            {
                String name = in2.nextLine();

                if(sus.contains(name))
                {
                    System.out.println(i + ". " + name);
                    i++;
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
}