import java.util.Scanner;

public class OneToNum
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // System.out.print("Enter a number: ");
        int stop = in.nextInt();

        // Use a loop to print out the numbers
        int i = 1;
        while(i <= stop)
        {
            System.out.print(i + " ");
            i++;
        }
       
        System.out.println(); // Finish with a new line.
    }    
}
