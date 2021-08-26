import java.util.*;

class Customer_with_getcharge 
{
    private String _name;
    private List<Rental> _rentals;

    public Customer (String name, List<Rental> rentals)
    {
        _name = name;
        _rentals = rentals;
    };

    public void addRental(Rental arg)
    {
        _rentals.add(arg);
    }

    public List<Rental> getRentals()
    {
        return _rentals;
    }

    public String getName ()
    {
        return _name;
    };

    public double getTotal(Rental rental)
    {
        return rental.getCharge();
    }

    public String statement()
    {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "";

        for (Rental rental : _rentals)
        {
            double thisAmount = getTotal(rental);

            // add frequent renter points
            frequentRenterPoints ++;

            // add bonus for a two day new release rental
            if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1)
            {
                frequentRenterPoints++;
            }

            //show figures for this rental
            result += "  " + rental.getMovie().getTitle()+ "  " + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount; 

        }

        // footer
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points\n";
        return result; 
    }

    public String toString()
    {
        return _name + ": " + _rentals;
    }
} 
