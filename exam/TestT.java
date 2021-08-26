import java.util.*;

public class TestT
{
    // Add a static method called large to this class.
    public static List <Truck> large(List <Truck> trucks)
    {
        List <Truck> large = new ArrayList<Truck>();

        for(Truck truck : trucks)
            if(truck.getEngineSize() >= 1200 && truck.getEngineSize() <= 1800)
            {
                large.add(truck);
            }

        return large;
    }
}