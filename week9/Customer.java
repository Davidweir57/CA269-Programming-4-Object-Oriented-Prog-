import java.util.*;

class Customer 
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
        double amount=0;

        switch(rental.getMovie().getPriceCode())
        {
            case Movie.REGULAR:
                amount += 2;

                if(rental.getDaysRented() > 2)
                {
                    amount += (rental.getDaysRented() - 2) * 1.5;
                }
                break;

            case Movie.NEW_RELEASE:
                amount += rental.getDaysRented() * 3;
                break;
            
            case Movie.CHILDRENS:
                amount += 1.5;

                if(rental.getDaysRented() > 3)
                {
                    amount += (rental.getDaysRented() - 3) * 1.5;
                }
                break;
        }

        return amount;
    }

    public int getFrequentRenterPoints(Rental rental)
    {
        int points = 1; // 1 point for a movie 

        // add bonus for a two day new release rental
        if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1)
        {
            points++;
        }

        return points;
    }

    public double getTotalCharge()
    {
        double charge=0;

        for(Rental rental : getRentals())
        {
            charge += getTotal(rental);
        }

        return charge * 2;
    }

    public int getTotalFrequentRenterPoints()
    {
        int points=0;

        for(Rental rental : getRentals())
        {
            points += getFrequentRenterPoints(rental);
        }

        return points;
    }

    public String statement()
    {
        String output = "Statement for " + getName() + "\n";

        for(Rental rental : getRentals())
            output += "  " + rental.getMovie().getTitle() + "  " + rental.getCharge() + "\n";

        output += "Amount owed is " + getTotalCharge() + "\n";
        output += "You earned " + getTotalFrequentRenterPoints()  + " frequent renter points\n";
        return output;
    }

    public String htmlStatement()
    {
        String result = "<h1>Statement for " + getName() + "</h1>\n";
        result += "<ol>\n";

        for(Rental rental : getRentals())
        {
            result += "  <li>" + rental.getMovie().getTitle() + "  " + rental.getCharge() + "</li>\n";
        }

        result += "</ol>\n";

        result += "<p>Amount owed is " + getTotalCharge() + "</p>\n";
        result += "<p>You earned " + getTotalFrequentRenterPoints() + " frequent renter points.</p>\n";

        return result;
    }

    public String toString()
    {
        return _name + ": " + _rentals;
    }
} 
