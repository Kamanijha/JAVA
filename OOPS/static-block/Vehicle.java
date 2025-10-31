
class Vehicle{
	static int x=50;
	static{
		System.out.println("static block-1 x is: "+x);
		test();
	}
	public static void test(){
		System.out.println("This is test method");

	}

	public static void main(String[] args){
		System.out.println("This is main method of Vehicle");

	}
	static{
		System.out.println("static block-2 ends");
		test();
	}	
}