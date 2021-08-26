public class Test(trucks)
{
    // Add a static method called large to this class.
    public static Truck[] large(Truck [] trucks)
    {
        List <Truck> big = new ArrayList<Truck>();

        for(int i=0; i<trucks.length; i++)
        {
            if(trucks[i].getEngineSize() >= 1200 && trucks[i].getEngineSize() <= 1800)
            {
                large = trucks[i]
            }
        }
    }
}