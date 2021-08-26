public class testOrder
{
    public static void main(String [] args)
    {
        Order a = new Thing(9);
        Order b = new Thing(10);
        Order c = new Thing(10);
        
        System.out.println(a + " greaterThan(" + b + ") is " + a.greaterThan(b));
        System.out.println(b + " greaterThan(" + a + ") is " + b.greaterThan(a));
        System.out.println(b + " greaterThan(" + c + ") is " + b.greaterThan(c));
        System.out.println(c + " greaterThan(" + b + ") is " + c.greaterThan(b));
    }
}