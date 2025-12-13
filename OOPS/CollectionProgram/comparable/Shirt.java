

public class Shirt implements Comparable<Shirt> {
	String brand;
	double price;
	Integer size;
	
	public Shirt(String brand, double price, int size) {
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	@Override
	public String toString() {
		return "[brand=" + brand + "\tprice=" + price + "\tsize=" + size + "]";
	}
	/*
	//If size is same then sort on price
	@Override
	public int compareTo(Shirt s) {
		if (this.size == s.size) 
			return Double.compare(this.price, s.price);//(int)(this.price-s.price);

		return Integer.compare(s.size, this.size);//this.size - s.size;
	}*/
	
	
	//sort on size but if size is same then sort on price and if price is also same then sort on brand
	@Override
	public int compareTo(Shirt s) {
		if (this.size == s.size) {
			if (this.price == s.price) {
				return this.brand.compareTo(s.brand);
			}
			return Double.compare(this.price, s.price);//(int)(this.price-s.price);
		}
		return this.size.compareTo(s.size);//this.size - s.size;
	}
	
	
	
	
	
	
	/*//sort on price
	@Override
	public int compareTo(Shirt s) {
		return Double.compare(this.price, s.price);// (int)(this.price-s.price);
	}*/
	
	/*//sort on brand
	@Override
	public int compareTo(Shirt s) {
		return this.brand.compareTo(s.brand);
	}*/

}
