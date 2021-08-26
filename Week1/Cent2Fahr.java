import java.util.Scanner;

public class Cent2Fahr
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a temperature in degrees Centigrade: ");

        int celsius = in.nextInt();

        double farenheit = (9.0/5.0) * celsius + 32;

        System.out.println(celsius + " in Farenheit is " + farenheit);

    }
}