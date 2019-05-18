import java.util.Scanner;

class Stack{
   private int[] stack;
   private int size;
   
   public Stack(){
      stack = new int[100];
      size = 0;
   }
   
   public void print(){
      for(int i = 0; i < size; i++){
         System.out.println(stack[i]);
      }
   }
   
   public int Pop(){

   }
   
   public int Peek(){

   }
   
   public void Push(int insert){

   }
}

class Main{
   public static void main(String args[]){
      Scanner reader = new Scanner(System.in);
      Stack stack = new Stack();
      int answer = 1;
      while(answer != 0){
         System.out.println("Do you want to Pop = 1, Push = 2, Peek = 3, or Exit = 0");
         while(!reader.hasNextInt()){
            reader.next();
         }
         answer = reader.nextInt();
         if(answer == 1){
            System.out.println("Removed: " + stack.Pop());
         }
         
         else if(answer == 2){
            System.out.println("What number do you want to insert?");
            while(!reader.hasNextInt()){
               reader.next();
            }
            int insert = reader.nextInt();
            stack.Push(insert);
         }
            
         else if(answer == 3){
            System.out.println("You Peeked at: " + stack.Peek());
         }
      }
   }
}
