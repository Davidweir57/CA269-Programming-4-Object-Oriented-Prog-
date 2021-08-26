import java.util.Scanner;

public class NoMinusOne
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers: ");

        int curr = in.nextInt();
        int prev = curr;

        while(curr != -1)
        {
            prev = curr;
            curr = in.nextInt();
        }

        System.out.println("The penultimate number was: " + prev);
    }
}
