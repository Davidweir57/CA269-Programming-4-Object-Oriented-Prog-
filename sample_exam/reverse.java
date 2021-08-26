import java.util.*;

public class Test
{
    // Create a static void method called reverse which takes an array of ints
    public static void reverse(int [] num)
    {
        int len = num.length;

        for(int i=0; i<len/2; i++)
        {
            int t = num[i];
            num[i] = num[len - i -1];
            num[len - i - 1] = t;
        }
    }

    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int len = in.nextInt();
        
        int [] num = new int[len];
        System.out.print("Enter " + len + " numbers: ");
        for(int i = 0; i < num.length; i++)
            num[i] = in.nextInt();
            
        Test.reverse(num);

        System.out.print("The numbers reversed are:");
        for(int i = 0; i < num.length; i++)
            System.out.print(" " + num[i]);
            
        System.out.println();
    }
}