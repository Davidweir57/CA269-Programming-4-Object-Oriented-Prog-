public class Truck implements Order
{
   private String make;
   private int engineSize;

   public Truck(String make, int engineSize)
   {
      this.make = make;
      this.engineSize = engineSize;
   }

   public String getMake()
   {
      return make;
   }

   public int getEngineSize()
   {
      return engineSize;
   }
   
   public String toString()
   {
       return make + " -> " + engineSize;
   }

   public boolean greaterThan(Order other)
   {
        Truck truck2 = (Truck) other;
        if(engineSize > truck2.engineSize)
        {
            return true;
        }
        else
        {
            return false;
        }
   }
}