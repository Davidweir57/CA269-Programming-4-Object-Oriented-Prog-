public class Point implements Order
{
    private double x, y;
    
    public Point(double newX, double newY)
    {
        x = newX;
        y = newY;
    }

    public boolean lessThan(Order other)
    {
        Point point2 = (Point) other;

        if(this.x < point2.x)
        {
            return true;
        }
        else if(this.x == point2.x)
        {
            if(this.y < point2.y)
            {
                return true;
            }
        }
        else
        {
            return false;
        }

        return false;
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}