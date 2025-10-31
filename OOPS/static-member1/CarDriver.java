class CarDriver{

    public static void main(String[] args){
		System.out.println("====Program Starts===");
		
		Car.printDetails();  // static method call inside another class by using only class refernce
		System.out.println("===================");
		Car.printDetails();

		System.out.println("====Program Ends!====");
	}
}