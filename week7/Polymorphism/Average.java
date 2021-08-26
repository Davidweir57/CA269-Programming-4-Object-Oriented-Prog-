public class Average
{
    public static double averageArea(Shape [] objects)
    {
        double areas=0;

        for(int i=0; i < objects.length; i++)
        {
            areas = areas + objects[i].area();
        }

        return(areas / objects.length);
    }
}
