import java.util.Scanner;

public class HowManyNumbers
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers: ");

        int curr = in.nextInt();
        int count=1;

        while(curr != -1)
        {
            curr = in.nextInt();
            count++;
        }

        System.out.println(count-1 + " numbers were entered.");    
    }
}
