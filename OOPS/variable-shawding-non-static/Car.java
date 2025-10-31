// class Car{

//     int x = 90;
//     int y;
//     public void test(){
//         int x= 40;
//         int y = 67;
//         System.out.println(x);
//         System.out.println(y);
//         this.x  = 50;
//         this.y = 100;
//         System.out.println(this.x);
//         System.out.println(this.y);
//     }
//}

class Car{
	int x=48;
	public  void test(){
		int y=20;
		int x=300;
		System.out.println(y);
		System.out.println(x);
		System.out.println("Object address from test(): "+this);
		System.out.println(this.x);
		demo();
	}
	public void demo(){
		System.out.println("obj ref from demo method is: "+this);
		System.out.println("demo method and x is: "+x);
		System.out.println("demo method and x is: "+this.x);
	}		
}