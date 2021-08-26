import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class EvenOdd
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();

        System.out.print("Enter numbers: ");
        int num = in.nextInt();

        while(num != -1)
        {
            if(num % 2 == 0)
            {
                even.add(num);
            }
            else
            {
                odd.add(num);
            }

            num = in.nextInt();
        }

        System.out.print("Odd: ");

        for(int number : odd)
        {
            System.out.print(number + " ");
        }

        System.out.print("\nEven: ");

        for(int number : even)
        {
            System.out.print(number + " ");
        }
    }
    
}