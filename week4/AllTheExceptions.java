public class AllTheExceptions
{
   public static void main(String [] args)
   {
       try
       {
            Broken broke = new Broken();

            System.out.println("Testing");
            broke.cracked();
        }
        catch(Exception e)
        {
            System.out.println(e.getClass().getSimpleName());
        }
        finally
        {
            System.out.println("Finally!");
        }
   }
}