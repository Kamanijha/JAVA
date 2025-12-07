

public class Laptop implements Comparable<Laptop>{

    String brand;
	double price;
	int size;

    public Laptop(String brand, double price, int size) {
		this.brand = brand;
		this.price = price;
		this.size = size;
	}
    
    @Override
	public String toString() {
		return "[brand=" + brand + "\tprice=" + price + "\tsize=" + size + "]";
	}

     //If size is same then sort on price
    // @Override
	// public int compareTo(Laptop l) {
	// 	if (this.size == l.size) 
	// 		return Double.compare(this.price, l.price);
                      //(int)(this.price-l.price);

	// 	return Integer.compare(l.size, this.size);//this.size - l.size;
	// }


    
    //sort on size but if size is same then sort on price and if price is also same then sort on brand
    // @Override
	// public int compareTo(Laptop l1) {
	// 	if (this.size == l1.size) {
	// 		if (this.price == l1.price) {
	// 			return this.brand.compareTo(l1.brand);
	// 		}
	// 		return Double.compare(this.price, l1.price);//(int)(this.price-s.price);
	// 	}
	// 	return Integer.compare(this.size, l1.size);//this.size - l.size;
	// }


    //sort on price
	@Override
	public int compareTo(Laptop l1) {
		return  Double.compare(this.price, l1.price);
        // (int)(this.price-l.price);
	}
	
	/*//sort on brand
	@Override
	public int compareTo(Laptop l) {
		return this.brand.compareTo(l.brand);
	}*/

}
