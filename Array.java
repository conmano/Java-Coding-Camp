class Array{
   public static void main(String args[]){
      int[] numbers = new int[20];
      for(int i = 0; i < 20; i++){
         numbers[i] = (i * 2) % 10;
      }
      
      for(int i = 0; i < 20; i++){
         System.out.println("i: " + numbers[i]);
      }
   }
}