class IfElseWhileFor{

   //IfStatement: takes in a boolean and checks if its true
   public void IfStatement(boolean check){
      if(check == true)
         System.out.println("If statement worked");
   }
   
   //IfElseStatement: takes in a boolean and checks if its false, otherwise it prints the else
   public void IfElseStatement(boolean check){
      if(check != true)
         System.out.println("2nd If statement worked");
      else
         System.out.println("Else Statement worked");
   }
   
   //WhileStatement: creates an in i and prints it until it is equal to ten
   public void WhileStatement(){
      int i = 0;
      while(i < 10){
         System.out.println("i: " + i);
         i++;
      }
   }
   
   //ForStatement: Runs a for statement initializing j as 5 and printing until it reaches 11
   public void ForStatement(){
      for(int j = 5; j <= 11; j += 2)
         System.out.println("j: " + j);
   }
}

class Main{
   public static void main(String args[]){
      IfElseWhileFor Tutorial = new IfElseWhileFor();
      Tutorial.IfStatement(true);
      Tutorial.IfElseStatement(true);
      Tutorial.WhileStatement();
      Tutorial.ForStatement();
   }
}
   