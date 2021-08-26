import java.lang.Math;

public class Point implements Order
{
    private double x, y;
    
    public Point(double newX, double newY)
    {
        x = newX;
        y = newY;
    }

    public double squared(double num)
    {
        return num * num;
    }

    public boolean lessThan(Order point2)
    {
        boolean result = false;
        Point otherPoint = (Point) point2;

        if(Math.sqrt(squared(this.x) + squared(this.y)) < Math.sqrt(squared(otherPoint.x) + squared(otherPoint.y)) )
        {
            result = true;
        }

        return result;
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}