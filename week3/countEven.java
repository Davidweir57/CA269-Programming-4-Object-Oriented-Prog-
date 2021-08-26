public class Test
{
    // Create a static method called countEven which returns the number of even numbers in the array

    public static int countEven(int [] nums)
    {
        int count=0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                count++;
            }
        }

        return count;
    }
    
    // public static void main(String [] nums)
    // {
	// 	int [] num = {2, 3, 5, 7, 11, 13, 17, 5, 0, -5, 5};
	// 	int result = countEven(num);
	// 	System.out.println(result);
    // }
}