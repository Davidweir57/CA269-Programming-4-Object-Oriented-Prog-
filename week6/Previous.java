import java.util.*;

public class Previous
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        List<Integer> seen = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();

        System.out.println("Enter some numbers (-1 to end)");
        int num = in.nextInt();

        while(num != -1)
        {
            if(set.contains(num))
            {
                seen.add(num);
            }
            else
            {
                set.add(num);
            }

            num = in.nextInt();
        }

        System.out.println("Previous:");

        for(int number : seen)
        {
            System.out.println(number);
        }
    }
}
