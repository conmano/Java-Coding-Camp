import java.util.Scanner;

class Queue{
   private int[] queue;
   private int maxSize;
   private int first;
   private int last;
   
   public Queue(){
      queue = new int[10];
      maxSize = 10;
      last = 0;
      first = 0;
   }
   
   public Queue(int size){
      queue = new int[size];
      maxSize = size;
      last = 0;
      first = 0;
   }
   
   public void Print(){
      System.out.println("This is the Queue");
      System.out.println("first = " + first + " Last = " + last);
      if(first == 0 && last == 0){
         System.out.println("The Queue is empty!");
      }
      else if(last < first || (last == first && first != 0)){
         for(int i = first; i < maxSize; i++){
            System.out.println(queue[i]);
         }
         for(int i = 0; i < last; i++){
            System.out.println(queue[i]);
         }
      }
      else{
         for(int i = first; i < last; i++){
            System.out.println(queue[i]);
         }
      }
   }
   
   public int Dequeue(){

   }
   
   public void Enqueue(int insert){
      
   }

class Main{
   public static void main(String args[]){
      Scanner reader = new Scanner(System.in);
      Queue queue = new Queue();
      int answer = 1;
      while(answer != 0){
         System.out.println("Do you want to Dequeue = 1, Enqueue = 2, Print = 3, or Exit = 0");
         while(!reader.hasNextInt()){
            reader.next();
         }
         answer = reader.nextInt();
         if(answer == 1){
            int removed = queue.Dequeue();
            if(removed == 0){
               System.out.println("The queue is empty. Nothing to remove!");
            }
            else{
               System.out.println("Removed: " + removed);
            }
         }
         
         else if(answer == 2){
            System.out.println("What number do you want to insert?");
            while(!reader.hasNextInt()){
               reader.next();
            }
            int insert = reader.nextInt();
            queue.Enqueue(insert);
         }
            
         else if(answer == 3){
            queue.Print();
         }
      }
   }
}