class Car{
	static int a;
	int x;
	static{
		System.out.println("This is static block");
	}
	
	{
		System.out.println("This is non-static block");
	}
		
}