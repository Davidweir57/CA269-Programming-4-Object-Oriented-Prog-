// public class Animal
// {

//     public String name;

//     public Animal(String name)
//     {
//         this.name = name;
//     }

//     public String greeting()
//     {
//         return "Hello, my name is " + this.name;
//     }
// }

public abstract class Animal
{
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
    private String name;
}