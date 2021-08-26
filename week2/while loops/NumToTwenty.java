import java.util.Scanner;

public class NumToTwenty
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        // Use a loop to print out the numbers
        while(num <= 20)
        {
            System.out.print(num + " ");
            num++;
        }
       
        System.out.println(); // Finish with a new line.
    } 
}
