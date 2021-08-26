public class Test
{
    public static int largest(int a, int b, int c)
    {
        // Write the code to find the largest of these three numbers
        
        // You will need a return statement to return the largest number
        if((a > b) && (a > c))
        {
            return a;
        }
        else if((b > a) && (b > c))
        {
            return b;
        }
        else if((c > b) && (c > a))
        {
            return c;
        }

        return a;

    }
}