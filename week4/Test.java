public class Test
{

    // 1. print student names
    // public static void print(Student [] student)
    // {
    //     for(int i = 0; i < student.length; i++)
    //         System.out.println(student[i].name);
    // }

    // 2. print student grades
    // public static void print(Student [] student)
    // {
    //     for(int i = 0; i < student.length; i++)
    //         System.out.println(student[i].mark);
    // }

    // 3. print student grades and name e.g. grade (name)

    // public static void print(Student [] student)
    // {
    //     for(int i = 0; i < student.length; i++)
    //         System.out.println(student[i].mark + " (" + student[i].name + ")");
    // }

    // 4. print student grades and name using getters e.g. grade (name)
   public static void print(Student [] student)
   {
        for(int i = 0; i < student.length; i++)
            System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
   }

   public static void printHonours(Student [] student)
   {
        for(int i = 0; i < student.length; i++)
        {
            if(student[i].getMark() >= 55)
            {
                System.out.println(student[i].getMark() + " (" + student[i].getName() + ")"); 
            }
        }
   }

   public static void printForties(Student [] student)
   {
        for(int i = 0; i < student.length; i++)
        {
            if(student[i].getMark() <= 49 && student[i].getMark() >= 40)
            {
                System.out.println(student[i].getMark() + " (" + student[i].getName() + ")"); 
            }
        }
   }

   public static int numberPasses(Student [] student)
   {
       int count=0;

       for(int i = 0; i < student.length; i++)
       {
           if(student[i].getMark() >= 40)
           {
                count++;
           }
       }   
       
       return count;
   }
   
   public static Student getBestStudent(Student [] student)
   {
       Student best = student[0];

       for(int i = 0; i < student.length; i++)
       {
           if(student[i].getMark() > best.getMark())
           {
               best = student[i];
           }
       }

       return best;
   }

   public static double getPassingAverage(Student [] student)
   {
       double total=0;
       int count=0;

       for(int i = 0; i < student.length; i++)
       {
           if(student[i].getMark() >= 40)
           {
               count++;
               total += student[i].getMark();
           }
       }

       double avg = total / count;

       return avg;
   }
}
