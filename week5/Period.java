public class Period
{
   // Private variables
   private Time start;
   private Time end;

   // Constructor (with two Time parameters)
   public Period(Time time1, Time time2)
   {
       start = time1;
       end = time2;
   }

   // overlaps(Period otherPeriod) // boolean method to check if two periods overlap

   public boolean overlaps(Period period2)
   {
        boolean result = false;

       if(this.start.isLater(period2.start) && period2.end.isLater(this.start))
       {
           result = true;
       }
       else if(period2.start.isLater(this.start) && this.end.isLater(period2.start))
       {
           result = true;
       }

       return result;
   }

   // String toString() // return a String representation of the Period
   public String toString()
   {
       return this.start + " -> " + this.end;
   }
}