import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class WordLength
{
    public static void main(String [] args)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);

        while(in.hasNext())
        {
            String [] words = in.nextLine().split(" ");

            for(String word : words)
            {
                int len = word.length();
                if(map.containsKey(len))
                {
                    map.put(len, map.get(len) + 1);
                }
                else
                {
                    map.put(len, 1);
                }
            }
        }

        for(int i : map.keySet())
        {
            System.out.println(i + ": " + map.get(i));
        }
    }
}