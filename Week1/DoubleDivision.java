import java.util.Scanner;

public class DoubleDivision
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter two floating point numbers: ");

        double a = in.nextDouble();
        double b = in.nextDouble();

        double res = a / b;

        System.out.println(a + " / " + b + " is " + res);
    }
}