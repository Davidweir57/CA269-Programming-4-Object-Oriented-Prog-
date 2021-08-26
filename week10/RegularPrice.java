public class RegularPrice extends Price
{
    public int getPriceCode()
    {
        return Price.REGULAR;
    }

    public double getCharge(int daysRented)
    {

        if(daysRented > 2)
        {
            return ((2 + (daysRented - 2) * 1.5) * 2);
        }

        return 4;
    }
}
