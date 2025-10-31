class VehicleDriver{
	public static void main(String[] args){
		System.out.println("====Program Starts===");
		Vehicle.test();
		System.out.println("x of Vehicle is: "+Vehicle.x);
		System.out.println("x of Vehicle again is: "+Vehicle.x);
		System.out.println("====Program Ends!====");
	}

	static{
		System.out.println("This is static block of Vehicle Driver");

	}
}