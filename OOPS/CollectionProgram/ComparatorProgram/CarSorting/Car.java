

public class Car {
	String name;
	double price;
	int hp;
	public Car(String name, double price, int hp) {
		this.name = name;
		this.price = price;
		this.hp = hp;
		
	}
	@Override
	public String toString() {
		return "Car [name=" + name + "\tprice=" + price + "\thp=" + hp + "]";
	}
}    
