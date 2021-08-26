public class orderV1 implements Order
{
    private double x, y;
    
    public orderV1(double newX, double newY)
    {
        x = newX;
        y = newY;
    }

    public boolean lessThan(Order point2)
    {
        boolean result = false;
        orderV1 otherPoint = (orderV1) point2;

        if(this.x < otherPoint.x)
        {
            result = true;
        }
        else if(this.x == otherPoint.x)
        {
            if(this.y < otherPoint.y)
            {
                result = true;
            }
        }

        return result;
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}