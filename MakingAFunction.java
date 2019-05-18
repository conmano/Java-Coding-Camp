import java.util.Scanner;

class MakingAFunction {
   public static void main(String args[]){
      Scanner reader = new Scanner(System.in);
      System.out.println("Please give me an int");
      while(!reader.hasNextInt())
         reader.next();
      int input = reader.nextInt();
      System.out.println("Your new number after doing something fun: " + doSomethingFun(input));
   }
   
   public static int doSomethingFun(int num1){
      System.out.println("Doing something with your number: " + num1);
      num1 = num1 % 10;
      return num1;
   }
}
