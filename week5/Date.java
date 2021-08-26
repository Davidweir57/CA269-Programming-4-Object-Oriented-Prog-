import java.util.Scanner;

public class Date
{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date()
    {
        day = 1;
        month = 1;
        year = 2000;
    }

    public Date(String date)
    {
        String [] split = date.split(" ");

        this.day = Integer.parseInt(split[0]);
        this.month = Integer.parseInt(split[1]);
        this.year = Integer.parseInt(split[2]);
    }
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }

    public boolean isOnOrAfter(Date otherDate)
    {
        boolean result = false;
        if( (this.year >= otherDate.year) && (this.month >= otherDate.month) && (this.day >= otherDate.day) )
        {
            result = true;
        }

        return result;
    }

    // testing for constructors and isOnOrAfter
    // public static void main(String [] args)
    // {
    //     Date beginning = new Date();
    //     System.out.println(beginning);

    //     Date big = new Date(6, 8 , 1945);
    //     System.out.println(big);

    //     String input = "21 9 2015";
    //     System.out.println(new Date(input));

    //     Date day1 = new Date("27 7 2006");
    //     Date day2 = new Date("27 7 2007");
        
    //     System.out.println(day1.isOnOrAfter(day2)); // prints false. day1 is not after day2
    //     System.out.println(day2.isOnOrAfter(day1)); // prints true. day2 is after day1
    // }

    // code for Lastest Date question
    // Here is the main method which will read in a sequence of dates.
    // Modify it so that it prints the latest date.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        String line;
        Date latest = new Date("0 0 0");
        
        while(in.hasNextLine())
        {
            line = in.nextLine();
            if(line.length() != 0)
            {
                Date date = new Date(line);
                // Do what you want with the date.
                if(date.isOnOrAfter(latest))
                {
                    latest = date;
                }
            }
            else
            {
                break;
            }
    
        }
        System.out.println(latest); // Print the latest date
    }
}
