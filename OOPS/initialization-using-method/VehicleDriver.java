class VehicleDriver{
	static int p=23;
	public static void main(String[] args){
		System.out.println("====Program Starts===");
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle();
		Vehicle v3=new Vehicle();

		v1.setDetails("Car", 23456.7, "White");
		v2.setDetails("Bus", 83456.7, "Green");
		v3.setDetails("Bike", 13456.7, "Red");

		String details1=v1.getDetails();
		String details2=v2.getDetails();
		String details3=v3.getDetails();
		
		
		//System.out.println(v1.getDetails());
		System.out.println(details1);
		System.out.println(details2);
		System.out.println(details3);
		System.out.println("====Program Ends!====");
	}
}
