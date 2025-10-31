class CarDriver{

    public static void main(String[] args){
        System.out.println("====Program Starts===");
		int x=12;
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();

		c1.model="Safari";
		c1.price=1234.5;
		c1.color="White";
		c2.model="Alto";
		c2.price=10234.5;
		c2.color="Blck";
		c3.model="nano";
		c3.price=100234.5;
		c3.color="Red";

		c1.printDetails();
		c2.printDetails();
		c3.printDetails();

		System.out.println("====Program Ends!====");
    }
}