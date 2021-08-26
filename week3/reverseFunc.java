import java.util.Scanner;

public class Test
{
    public static int [] reverse(int [] nums)
    {
        int arr [] = new int[nums.length];
        int len = nums.length;

        for(int i=0, j=len-1; i<=j; i++, j--)
        {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        return nums;
    }

    // public static void main(String [] args)
    // {
    //     // Create a scanner object
    //     Scanner in = new Scanner(System.in);
        
    //     System.out.print("How many numbers: ");
    //     int len = in.nextInt();
        
    //     int [] num = new int[len];
    //     System.out.print("Enter " + len + " numbers: ");
    //     for(int i = 0; i < num.length; i++)
    //         num[i] = in.nextInt();
            
    //     Test.reverse(num);

    //     System.out.print("The numbers reversed are:");
    //     for(int i = 0; i < num.length; i++)
    //         System.out.print(" " + num[i]);
            
    //     System.out.println();
    // }
}
