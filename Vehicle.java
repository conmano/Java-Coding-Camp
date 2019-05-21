class Vehicle{
   private String brand;
   private int tankSize;
   private int fuel;
   private boolean clean;
   private boolean works;
   
   public Vehicle(){
      this.brand = "";
      this.tankSize = 10;
      this.fuel = 10; 
      this.clean = true;
      this.works = true;
   }
   
   public Vehicle(String brand, int tankSize, int fuel, boolean clean, boolean works){
      this.brand = brand;
      this.tankSize = tankSize;
      this.fuel = fuel;
      this.clean = clean;
      this.works = works;
   }
   
   public void getAllDetails(){
      System.out.println("Your car is a " + this.brand);
      System.out.println("Tank can hold " + this.tankSize + " gallons");
      System.out.println("You have " + this.fuel + " gallons of fuel");
      System.out.println("The car is clean is " + this.clean);
      System.out.println("The car is working is " + this.works);
   }
      
   public void setBrand(String brand){
      this.brand = brand;
   }
   
   public String getBrand(){
      return this.brand;
   }
   
   private int getFuel(){
      return this.fuel;
   }
   
   public boolean getClean(){
      return this.clean;
   }
   
   public boolean getWorks(){
      return this.works;
   }
   
   public int getTankSize(){
      return this.tankSize;
   }
   
   public void refuel(int cash){
      for(; cash > 0; cash -= 3){
         if(fuel < tankSize - 1)
            fuel = fuel + 1;
         else
            break;
      }
   }
   
   public void drive(){
      int count = 1;
      if(this.works == true && getFuel() > 1){
         for(; this.fuel > 1; fuel -= 1, count++){
            System.out.println("Drove " + count + "miles");
         }
      }
      else
         System.out.println("You Have no gas!");
      System.out.println("Ran out of gas after " + count + " miles");
      this.clean = false;
   }
   
   public void makeClean(int cash){
      if(cash >= 10)
         this.clean = true;
      else
         System.out.println("You didn't bring enough cash to clean your car!");
   }
   
   public void makeWork(int cash){
      if(cash >= 100)
         this.works = true;
      else
         System.out.println("You didn't bring enough cash to fix your car!");
   }
}

class Main{
   public static void main(String args[]){
      Vehicle car1 = new Vehicle();
      Vehicle car2 = new Vehicle("Honda", 40, 20, true, false);
      car1.getAllDetails();
      System.out.println();
      car2.getAllDetails();
      System.out.println();
      car1.setBrand("Acura");
      System.out.println("The first car is actually a " + car1.getBrand());
   }
}
      
      