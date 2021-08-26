public class NewReleasePrice extends Price
{
    int getPriceCode()
    {
        return Price.NEW_RELEASE;
    }

    public double getCharge(int daysRented)
    {
        return (daysRented * 3);
    }

    int getFrequentRenterPoints(int daysRented)
    {
        if (daysRented > 1)
        {
            return 2;
        }

        return 1;
    }
}
