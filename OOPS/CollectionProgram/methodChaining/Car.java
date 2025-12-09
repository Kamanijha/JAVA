public class Car {
	String name;
	int hp;
	double price;
	String color;
	Car(){
		
	}

	Car(String name, int hp, double price, String color) {
		this.name = name;
		this.hp = hp;
		this.price = price;
		this.color = color;
	}

	public Car printName() {
		System.out.println("Car Name: " + name);
	return this;
	}

	public Car printHp() {
		System.out.println("Car Horse Power: " + hp);
	return this;
	}

	public Car printPrice() {
		System.out.println("Car Price: " + price);
	return this;
	}

	public Car printColor() {
		System.out.println("Car Color: " + color);
	return this;
	}

}