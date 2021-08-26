public class Time
{
   // Private variables
   private String hour;
   private String mins;

   // Constructor (with a String parameter)
   public Time(String time)
   {
       hour = time.substring(0, 2);
       mins = time.substring(2, 4);
   }

   // isLater(Time otherTime) // boolean method to compare two times
   public boolean isLater(Time otherTime)
   {
       boolean result = false;
       if( (Integer.parseInt(this.hour) == Integer.parseInt(otherTime.hour)) && (Integer.parseInt(this.mins) > Integer.parseInt(otherTime.mins)))
       {
            result = true;
       }
       else if ((Integer.parseInt(this.hour) > Integer.parseInt(otherTime.hour)))
       {
           result = true;
       }

       return result;
   }
   // String toString() // return a String representation of the time (hh:mm)

   public String toString()
   {
       return (hour + ":" + mins);
   }
}

