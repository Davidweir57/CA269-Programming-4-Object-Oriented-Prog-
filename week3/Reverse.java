import java.util.Scanner;

public class Reverse
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int num = in.nextInt();
        System.out.print("Enter " + num + " numbers: ");

        // Read in the numbers
        int arr [] = new int[num];

        for(int i=0; i<num; i++)
        {
            arr[i] += in.nextInt();
        }
        
        // reverse the numbers
        
        // print them out

        System.out.print("The numbers reversed are:");

        for(int i=num-1; i>=0; i--)
        {
            System.out.print(" " + arr[i]);
        }
        // Use System.out.print(" " + num[i]); and finish with a newline.
        System.out.println();
    }
}