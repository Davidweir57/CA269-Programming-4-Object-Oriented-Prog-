import java.util.*;

public class MakeMap
{
    // No main method required.

    public static Map makeMap(Scanner in)
    {
        Map<String, Integer> map = new HashMap<>();

        while(in.hasNext())
        {
            String string = in.next();
            int num = in.nextInt();

            map.put(string, num);
        }

        return map;
    }
}