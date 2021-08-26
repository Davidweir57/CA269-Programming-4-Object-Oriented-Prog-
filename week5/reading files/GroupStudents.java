import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GroupStudents
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
                int numStu = in.nextInt();
                Student [] group = new Student[numStu]; // Your program should fill in this array from a file. The filename will be on the command line.

                for(int i=0; i < numStu; i++)
                {
                    String name = in.next();
                    int mark = in.nextInt();
                    group[i] = new Student(name, mark);
                }
                Student.print(group);
            }
            catch(FileNotFoundException e)
            {
                System.out.println("This file cannot be found.");
            }
        }
   }
}