import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class WriteStudents
{
   public static void main(String [] args)
   {
        if(args.length < 1)
        {
            System.out.println("Usage java ReadNames <filename>");
            System.exit(1);
        }
        else
        {
            try
            {
                Scanner in = new Scanner(new File(args[0]));
                PrintWriter out = new PrintWriter(args[1]);
                int numStu = in.nextInt();
                Student [] group = new Student[numStu]; // Your program should fill in this array from a file. The filename will be on the command line.

                out.println(numStu);

                for(int i=0; i < numStu; i++)
                {
                    String name = in.next();
                    int mark = in.nextInt()+1;
                    group[i] = new Student(name, mark);
                    out.println(name + " " + mark);
                }

                out.close();
            }
            catch(FileNotFoundException e)
            {
                System.out.println("This file cannot be found.");
            }
        }
   }
}