import java.util.Scanner;
public class IT24102630Lab7Q2B
{
     public static void main(String[] args)
     {
     
     Scanner input = new Scanner(System.in);

     int i;
     int j;
     int k = 1;
   
     for(j = 1; j <= 5; j++)
     {
        System.out.print( j + "-" + " " );
     
        for(i = 1; i <= k; i++)
        {
            System.out.print( "*" + " " );
        }
      
       System.out.println("\n");
        
       k = k + 1;
   
     }

     }
}      