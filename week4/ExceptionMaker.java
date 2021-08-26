// ReverseArgs.java but purposefully designed to raise a java.lang.ArrayIndexOutOfBoundsException error

public class ExceptionMaker
{
    public static void main(String [] args)
    {
        for(int i=args.length; i >= 0; i--)
        {
            System.out.println("args[" + i + "]" + " = " + args[i]);
        }
    }
}