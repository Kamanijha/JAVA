

public class Laptop implements Comparable<Laptop>{
	String brand;
	int ram;
	double price;
	int hd;
	Laptop(String brand, int ram, double price, int hd){
		this.brand=brand;
		this.ram=ram;
		this.price=price;
		this.hd=hd;
	}
	@Override
	public String toString() {
	return brand+"\t"+ram+"\t"+price+"\t"+hd;
	}
	@Override
	public int compareTo(Laptop o) {
		return this.price==o.price?0:this.price>o.price?1:-1;
	}
	

}