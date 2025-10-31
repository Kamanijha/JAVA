class FruitDriver{
	public static void main(String[] args){
		Fruit f1=new Fruit("Mango");
		Fruit f2=new Fruit("Apple");
		Fruit f3=new Fruit("Orange", 45);
		Fruit f4=new Fruit("Apple", 180, "Red");
		Fruit f5=new Fruit("Mango", 110, "Yellow");
		Fruit f6=new Fruit("Kiwi", 100, "Green", 2.1);
		Fruit f7=new Fruit("Orange", 70, "Yellow", 2.8);
		
		System.out.println(f1.getDetails());
		System.out.println(f2.getDetails());
		System.out.println(f3.getDetails());
		System.out.println(f4.getDetails());
		System.out.println(f5.getDetails());
		System.out.println(f6.getDetails());
		System.out.println(f7.getDetails());


	}
}
