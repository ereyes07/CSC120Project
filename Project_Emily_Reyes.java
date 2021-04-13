import java.util.Scanner;

public class Project_Emily_Reyes
{
   public static void main(String[] args)
   {
      double graphic = 0.0;               //The GPU clock speed
      double processor = 0.0;             //The CPU clock speed
      double cores = 0.0;                 //The number of Cores 
      int choice = 0;                     //The Monitor resolution 
      double multiplier = 0.0;            //for mutiplier 
      double performanceScore = 0.0;      //The performance score
      int number = 0;
      double highest = 0;
      
     
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
       String title = "\nComputer Hardware Graphics Quality Recommendation Tool";
      Scanner keyboard = new Scanner (System.in);
      
      //asking the audice how many computers are being processed
      System.out.println("How many computers are being processed? ");
      number = keyboard.nextInt();
        
        while (number < 0){
         System.out.print("Invalid input. Enter a number greater than 0: "); 
         number = keyboard.nextInt();
         
         System.out.println(title);
      }   
       for (int i = 0; i < number; i++){
            
      
      //asking the audience to enter the GPU speed 
      System.out.println("\nPlease enter the clock speed (in megahertz) of your graphic card (GPU): ");
      graphic = keyboard.nextDouble();
      
      while (graphic < 800 || graphic > 2000){
         System.out.println("Invalid please choose between 800 and 2000 MHz: ");
         graphic = keyboard.nextDouble();
       }  
      
      //asking the audience to enter CPU speed
      System.out.println("Please enter clock speed (in megahertz) of your processor(CPU): ");
      processor = keyboard.nextDouble();
      
      while (processor < 1000 || processor > 5500){
         System.out.println("Invalid please choose between 1000 and 5500 MHz: ");
         processor = keyboard.nextDouble();
      }
      
      //asking the audience to enter how many cores their CPU has
      System.out.println("Please enter the number of cores that your processor(CPU) has: ");
      cores = keyboard.nextDouble();
      
      while (cores < 1 || cores > 16){
         System.out.println("Invalid please choose between 1 and 16: ");
         cores = keyboard.nextDouble();
      }
      
      //choices of resolution
      System.out.println("1. 1280 x 720");
      System.out.println("2. 1920 x 1080");
      System.out.println("3. 2560 x 1440");
      System.out.println("4. 3840 x 2160");
      //asking the audience to pick a choice
      System.out.println("\nPlease select the resolution of your monitor: ");
      choice = keyboard.nextInt();
      
      while (choice < 1 || choice > 4){
         System.out.println("Invalid please choose between 1 and 4: ");
         choice = keyboard.nextInt();
      }
      
      
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
      performanceScore = ((5 * graphic) + (cores * processor)) * multiplier;
      System.out.printf("The total Preformance score is %.3f", performanceScore);

      //Computer Hardware Graphics Quality Recommendation Tool
      
      if(performanceScore > 17000)
      {
        System.out.println("\nRecommendation Graphic Quality: ultra");
      }   
      else if(performanceScore >= 17000)
      {
        System.out.println("\nRecommendation Graphic Quality: High");
      }  
      else if(performanceScore >= 15000)
      {
        System.out.println("\nRecommendation Graphic Quality: Medium");
      }
      else if(performanceScore >= 13000)
      { 
         System.out.println("\nRecommendation Graphic Quality: Low");
      }
      else
      {  
        System.out.println("\nRecommendation Graphic Quality: Unable to play");
      }     
      
     
     }
     
     
      System.out.println("\nThe highest performance score was: " + (performanceScore )); 
    
      System.out.println("\nThe lowest performance score was: "  + (performanceScore  ));
     
   }//end main
}//end class      