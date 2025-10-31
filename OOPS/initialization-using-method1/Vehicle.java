class Vehicle{
	String name;
	double price;
	String color;

	// Mutator Method
	public void setDetails(String name, double price, String color){
		this.name=name;
		this.price=price;
		this.color=color;
	}

	// Accessor Method
	public String getDetails(){
	    return "Name is: "+this.name+"\nPrice is: "+price+"\nColor is: "+color+"\n===========";
	}	
}