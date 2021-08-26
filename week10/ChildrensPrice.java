public class ChildrensPrice extends Price
{
    int getPriceCode()
    {
        return Price.CHILDRENS;
    }

    public double getCharge(int daysRented)
    {

        if(daysRented > 3)
        {
            return (1.5 + (daysRented - 3) * 1.5);
        }

        return 1.5;
    }
}
