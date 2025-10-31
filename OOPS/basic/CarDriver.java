class CarDriver{


    public static void main(String[] args){
		System.out.println("=======prgram start======");
        int x = 12; // local variBLLE
        System.out.println("x is :" + x);
        Car c1 = null;
        System.out.println("Car c1 is : " + c1);
         c1 = new Car();
         Car c2 = new Car();
         System.out.println("Car c1 is before : " + c1);
         System.out.println("Car c2 is before : " + c2);
        
         System.out.println("==================");
         c1 = c2;
         
         System.out.println("Car c1 is after : " + c1);
         System.out.println("Car c2 is after : " + c2);
         
	}
}