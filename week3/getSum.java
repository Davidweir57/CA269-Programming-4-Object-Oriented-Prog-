public class Test
{
    // Create a static method called getSum which sums an array of ints

    public static int getSum(int [] nums)
    {
        int sum = 0;

        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i];
        }

        return sum;
    }

    // public static void main(String [] args)
    // {
    //     int [] num = {2, 3, 5, 7, 11, 13, 17};
    //     // Call the method
    //     int x = Test.getSum(num);

    //     System.out.println(x);
    // }
}