// Modify this class so that it implements the Order interface
public class Cat implements Order
{
    private String name;
    
    public Cat(String n)
    {
        name = n;
    }

    public boolean lessThan(Order cat2)
    {
        boolean result = false;
        Cat otherCat = (Cat) cat2;

        if(this.name.length() < otherCat.name.length())
        {
            result = true;
        }

        return result;
    }
    
    public String toString()
    {
        return "cat: " + name;
    }
}