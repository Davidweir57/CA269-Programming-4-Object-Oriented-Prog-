public abstract class Animal
{

    private String name;

    public Animal(String n)
    {
        name = n;
    }

    abstract String hello();
    
    public String greeting()
    {
        return hello() + ", my name is " + name;
    }
    // private
}