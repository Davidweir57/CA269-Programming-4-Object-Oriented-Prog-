public class Test
{
    // Add a static print method to this class.
    public static void print(Student [] group)
    {
        for(int i=0; i<group.length; i++)
        {
            if(group[i].getMark() >= 55)
            {
                System.out.println(group[i].getMark() + " (" + group[i].getName() + ")");
            }
        }
    }
}