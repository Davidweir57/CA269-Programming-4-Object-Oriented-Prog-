public class DateV1
{
    private int day;
    private int month;
    private int year;

    public DateV1(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public DateV1()
    {
        day = 1;
        month = 1;
        year = 2000;
    }
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }

    public static void main(String [] args)
    {
        DateV1 beginning = new DateV1();
        System.out.println(beginning);

        DateV1 big = new DateV1(6, 8 , 1945);
        System.out.println(big);
    }
}
