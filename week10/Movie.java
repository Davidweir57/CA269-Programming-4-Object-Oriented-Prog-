public class Movie
{
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    public Price price;

    public Movie(String title, int priceCode)
    {
        _title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode()
    {
        return price.getPriceCode();
    }

    public void setPriceCode(int arg)
    {
        switch(arg)
        {
            case REGULAR:
                price = new RegularPrice();
                break;
            
            case CHILDRENS:
                price = new ChildrensPrice();
                break;

            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
        }
    }

    public double getCharge(int daysRented)
    {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented)
    {
        return price.getFrequentRenterPoints(daysRented);
    }

    public String getTitle ()
    {
        return _title;
    };
} 