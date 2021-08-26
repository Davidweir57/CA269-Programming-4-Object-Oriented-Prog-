public class Point
{
   private double x;
   private double y;

   public Point(double newX, double newY)
   {
      x = newX;
      y = newY;
   }

   public Point midPoint(Point otherPoint)
   {
       double midx = (this.x + otherPoint.x) / 2;
       double midy = (this.y + otherPoint.y) / 2;

       return new Point(midx, midy);
   }

   public String toString()
   {
      return "(" + x + ", " + y + ")";
   }
}