import java.util.Scanner;

class Main{
   public static void main(String args[]){
      Scanner reader = new Scanner(System.in);
      int option = 1;
      boolean playAgain = true;
      
      System.out.println("Welcome to the Java game arcade!");
      System.out.println("Currently the selection is very... very limited.");
      System.out.println("I'm hoping however you might be able to help me with that!");
      System.out.println("Here are your current options.");
      
      while(option != 0){
         System.out.println("");
         System.out.println("1 for Moon landing game");
         System.out.println("0 to exit");
         
         while(!reader.hasNextInt()){
            reader.next();
         }
         option = reader.nextInt();
         
         if(option == 1){
            while(playAgain == true){
               System.out.println("");
               playAgain = moonLanding();
            }
         }
         
         else if(option > 1 || option < 0){
            System.out.println("That is not a valid selection. Here are your options");
         }
        
         if(option == 0){
            System.out.println("Thank you for playing. Hope to see you again.");
         }
      }
   }
   
   public static boolean moonLanding(){
      Scanner reader = new Scanner(System.in);
      int fuel = 150;
      int height = 1500;
      int mph = 50;
      boolean rocketShip = true;
      boolean landed = false;
      int gasUsed = -1;
      int option = 0;
      int count = 0;
      boolean correct = false;
      
      System.out.println("Sir our program for navigation has failed. It is now up to you to land this ship!");
      System.out.println("To ensure a safe landing you must reach the moons surface at less than 10 mph.");
      System.out.println("Every gallon of gas you use decreases the rate that you're falling by 5 mph.");
      System.out.println("Every few seconds you start to fall 100 mph faster.");
      System.out.println("We believe in you captain!");
      System.out.println("");
      
      while(landed == false){
         count = 0;
         
         for(int i = (height / 100); i >= 0; i -= 1, count++){
            if(i == 0 && count == 0){
               System.out.println("*");
               System.out.println("0");
               break;
            }
            
            if(count == 0){
               System.out.println("*");
            }
            
            else{
               System.out.println(i * 100);
            }
         }
            
         System.out.println("");
         System.out.println("Height: " + height);
         System.out.println("Gallons of gas left: " + fuel);
         System.out.println("Rate at which you're falling: " + mph + " mph");
         System.out.println("");
         System.out.println("How much gas would you like to use?");
         
         correct = false;
         while(correct == false){
            while(!reader.hasNextInt()){
               reader.next();
            }
            
            gasUsed = reader.nextInt();
         
            if(gasUsed < 0 || gasUsed > fuel){
               System.out.println("Please enter a valid number between 0 and " + fuel);
            }
            else{
               correct = true;
            }
         }
         
         fuel -= gasUsed;
         mph = mph - (gasUsed * 5) + 100;
         height -= mph;
         
         System.out.println("");
               
         if(height <= 0){
            if(mph < 10){
               landed = true;
               rocketShip = true;
            }
            else{
               landed = true;
               rocketShip = false;
            }
         }
      }
      
      System.out.println("");
      
      if(rocketShip == true){
         System.out.println("Nice job on landing the ship captain!");
         System.out.println("You landed the ship at " + mph + " mph and had " + fuel + " gallons of gas left.");
      }
      else{
         System.out.println("The ship was destroyed and will cost us billions of dollars!!!");
         System.out.println("You landed the ship at " + mph + " mph and had " + fuel + " gallons of gas left.");
      }
      
      System.out.println("");
      System.out.println("Do you want to play again? 1 for yes, 0 for no");
      
      correct = false;
      while(correct == false){
         while(!reader.hasNextInt()){
            reader.next();
         }
         option = reader.nextInt();
         
         if(option == 1){
            return true;
         }
         else if(option == 0){
            return false;
         }
         else{
            System.out.println("Please enter a valid number, 1 or 0");
         }
      }
      
      return false;
   }
}