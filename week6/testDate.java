import java.util.Arrays;

public class testDate
{
   public static void main(String [] args)
   {
      Date [] dates = {
         new Date(1, 1, 3),
         new Date(1, 1, 2),
         new Date(3, 2, 1),
         new Date(29, 9, 1),
         new Date(30, 12, 1),
         new Date(1, 1, 10),
         new Date(1, 10, 1),
         new Date(10, 1, 1),
         new Date(2, 1, 10),
         new Date(29, 9, 1),
         new Date(30, 9, 1),
         new Date(1, 2, 10),
         new Date(1, 1, 1),
         };

      Arrays.sort(dates);

      System.out.println(Arrays.toString(dates));
   }
}