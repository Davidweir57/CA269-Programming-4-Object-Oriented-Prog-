import java.util.Scanner;

public class testPeriod
{
   public static void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
      String line1 = in.nextLine();
      String line2 = in.nextLine();

      Time time1 = new Time(line1);
      Time time2 = new Time(line2);
      Period p1 = new Period(time1, time2);
      System.out.println("Period 1 is " + p1);


      // Read a new set of times
      line1 = in.nextLine();
      line2 = in.nextLine();

      time1 = new Time(line1);
      time2 = new Time(line2);

      Period p2 = new Period(time1, time2);

      System.out.println("Period 2 is " + p2);
      if(p1.overlaps(p2))
         System.out.println("They overlap");
      else
         System.out.println("They do not overlap");
   }
}