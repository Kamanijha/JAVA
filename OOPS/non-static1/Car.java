class Car{
    static String brand="TATA";
	String model;
	double price;
	String color;

    public  void printDetails(){
		int p=18;
		System.out.println("Brand is: "+brand);
		System.out.println("Model is: "+model);
		System.out.println("Price is: "+price);		
		System.out.println("COlor is: "+color);
		test();
		System.out.println("=================");
	}

    public static void test(){
		int k=23;
		System.out.println("Brand is: "+brand);
		Car c1=new Car();
		c1.model = "1223abd"
		System.out.println("Model form test is: "+c1.model);
	}

}