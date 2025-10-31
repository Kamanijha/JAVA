class CarDriver{
	public static void main(String[] args){
		System.out.println("====Program Starts===");
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();

		c2.brand="MG";
        c2.z = 23;
		System.out.println(c2.z);
		System.out.println("Car Brand is: "+Car.brand);
		Car.test();

		//Car.brand="Maruti";
		
		System.out.println("===================");
		System.out.println("Car1 brand is: "+c1.brand);
		System.out.println("Car1 brand is: "+c1.z);
		c1.test();
		System.out.println("Car2 brand is: "+c2.brand);
		System.out.println("Car1 brand is: "+c2.z);
		c2.test();
		System.out.println("Car3 brand is: "+c3.brand);
		System.out.println("Car1 brand is: "+c2.z);
		c3.test();
		System.out.println("====Program Ends!====");
	}
}