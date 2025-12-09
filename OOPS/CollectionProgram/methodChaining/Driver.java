public class Driver {
	public static void main(String[] args) {
		Car c1=new Car("BMW", 500, 7500000, "Black");
		Car c2=new Car("Audi", 450, 6800000, "White");
		
		
		c1.printName().printHp().printName().printColor();
		System.out.println("--------------");
		c2.printHp().printName().printPrice().printColor();
	}

}
