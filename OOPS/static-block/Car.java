
class Car{
    
	int z;
	static int x;
	static String brand;
	static
	{
		System.out.println("static block-1 x is: "+x);
		x=34;
		System.out.println("static block-1 now x is: "+x);
	}
	public static void main(String[] args){
	}
	static
	{
		System.out.println("static block-2 x is: "+x);
	}
	public static void test(){
		System.out.println("this ix test method");
	}	

}