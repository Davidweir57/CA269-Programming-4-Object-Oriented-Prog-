public class testTest
{
   public static void main(String [] args)
   {
      Thing n1 = new Thing(1);
      Thing n2 = new Thing(2);
      Thing n3 = new Thing(3);

      System.out.println("Max of " + n1 + " and " + n2 + " is " + max(n1, n2));
      System.out.println("Max of " + n2 + " and " + n1 + " is " + max(n2, n1));
      System.out.println("Max of " + n3 + " and " + n1 + " is " + max(n3, n1));
      System.out.println("Max of " + n1 + " and " + n3 + " is " + max(n1, n3));
      System.out.println("Max of " + n3 + " and " + n2 + " is " + max(n3, n2));
      System.out.println("Max of " + n2 + " and " + n3 + " is " + max(n2, n3));
      System.out.println("Max of " + n1 + " and " + n2 + " is " + max(n1, n1));
   }
}