import java.util.Scanner;
public class IT24102630Lab7Q1A
{
       public static void main(String [] args)
       {
       
        Scanner input = new Scanner(System.in);
 
        System.out.println("Enter Marks for four Subjects:");
        
        int SubMark1,SubMark2,SubMark3,SubMark4;
        double Average;

        System.out.print("Enter Subject Mark 1:");       
        SubMark1 = input.nextInt();

        System.out.print("Enter Subject Mark 2:");
        SubMark2 = input.nextInt();

        System.out.print("Enter Subject Mark 3:");
        SubMark3 = input.nextInt();

        System.out.print("Enter Subject Mark 4:");
        SubMark4 = input.nextInt();

       
        double average = (SubMark1 + SubMark2 + SubMark3 + SubMark4) / 4.0;
       
        System.out.println("\n");
        System.out.println("Average is :" + average);
        
   
        if(average <= 100 && average >= 75)
        {
           System.out.println("Overall Grade is : Distinction");
        }

        else if(average <= 74 && average >= 50)
        {
            System.out.println("Overall Grade is : Credit");  
        }

        else 
        {
            System.out.println("Overall Grade is : Fail");
        }

      }

       
}
       
