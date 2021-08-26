import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PhoneNumbers
{
    public static void main(String [] args)
    {
        HashMap<String, String> map = new HashMap<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a name and number, or a name and ? to query (!! to exit)");;
        String line = in.nextLine();

        while(!line.equals("!!"))
        {
            String [] details = line.split(" ");
            String name=details[0], cmd=details[1];

            if(cmd.equals("?"))
            {
                if(map.get(name) == null)
                {
                    System.out.println("Sorry, there is no " + name);
                }
                else
                {
                    System.out.println(name + " has number " + map.get(name));
                }
            }
            else
            {
                map.put(name, cmd);
            }

            line = in.nextLine();

        }

        System.out.println("Bye");
    }
}