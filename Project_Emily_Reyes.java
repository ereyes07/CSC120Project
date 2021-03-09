import java.util.Scanner;

public class Project_Emily_Reyes
{
   public static void main(String[] args)
   {
      double graphic = 0.0;               //GPU amount
      double processor = 0.0;             //CPU amount
      double cores = 0.0;                 //Cores amount
      int choice = 0;                     //To hold choice
      double multiplier = 0.0;            //for mutiplier 
      double preformanceScore = 0.0;      //for total preformance score
      
     //choices
      final int option1 = 1;
      final int option2 = 2;
      final int option3 = 3;
      final int option4 = 4;
      
     //multiplier
       double option1multi = 1;
       double option2multi = .75;
       double option3multi = .55;
       double option4multi = .35;
      
      
      
      Scanner keyboard = new Scanner (System.in);
      //asking the audience to enter the GPU speed 
      System.out.println("Please enter the clock speed (in megahertz) of your graphic card (GPU): ");
      graphic = keyboard.nextDouble();
      //asking the audience to enter CPU speed
      System.out.println("Please clock speed (in megahertz) of your processor(CPU): ");
      processor = keyboard.nextDouble();
      //asking the audience to enter how many cores their CPU has
      System.out.println("Please enter the number of cores that your processor(CPU) has: ");
      cores = keyboard.nextDouble();
      //choices of resolution
      System.out.println("1. 1280 x 720");
      System.out.println("2. 1920 x 1080");
      System.out.println("3. 2560 x 1440");
      System.out.println("4. 3840 x 2160");
      //asking the audience to pick a choice
      System.out.println("\nPlease select the resolution of your monitor: ");
      choice = keyboard.nextInt();
      //each choice has a certain multiplier
      if(choice == option1)
      {
         multiplier = option1multi;
      }
      else if(choice == option2)
      {
         multiplier = option2multi;
      }   
      else if(choice == option3)
      {
         multiplier = option3multi;
      }
      else
      {
         multiplier = option4multi;
      }      
      
      //Toal preformance Score from all the data gathered 
      preformanceScore = ((5 * graphic) + (cores * processor)) * multiplier;
      System.out.printf("The total Preformance score is %.2f", preformanceScore);


           
      
   }//end main
}//end class      