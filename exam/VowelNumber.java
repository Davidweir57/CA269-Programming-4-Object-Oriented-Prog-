import java.util.Scanner;

public class VowelNumber
{
   public static void main(String [] args)
   {
      System.out.print("Enter a word :");
      String word = new Scanner(System.in).next();
      
      String vowelNumber = "";
      char [] chars = word.toCharArray();
      // Insert your code here

      for(int i=0; i<word.length(); i++)
      {
        if(chars[i] == 'a')
        {
          vowelNumber = vowelNumber + "1";
        }
        else if(chars[i] == 'e')
        {
          vowelNumber = vowelNumber + "2";
        }
        else if(chars[i] == 'i')
        {
            vowelNumber = vowelNumber + "3";
        }
        else if(chars[i] == 'o')
        {
            vowelNumber = vowelNumber + "4";
        }
        else if(chars[i] == 'u')
        {
            vowelNumber = vowelNumber + "5";
        }
        else
        {
            vowelNumber = vowelNumber + chars[i];
        }
      }

      
      System.out.println("VowelNumbered is :" + vowelNumber + ":");
   }
}