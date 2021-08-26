public class Count
{
    public static <T> int count(T [] arr, T guess)
    {
        int total=0;

        for(int i=0; i<arr.length; i++)
        {
            if(guess.equals(arr[i]))
            {
                total++;
            }
        }

        return total;
    }
}
