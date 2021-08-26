public class Circle extends Shape
{
    
    private double r;

    public Circle(String s, double rad)
    {
        super(s); // use Shape constructor; effect is name=s;
        this.r = rad;
    }

    public double area()
    {
        return(Math.PI * (r * r));
    }
}
