class Vehicle{

	String name;
	double price;
	String color;
    
	
	public void setDetails(String n, double p, String c){
		name=n;
		price=p;
		color=c;
	}
	public String getDetails(){
	return "Name is: "+name+"\nPrice is: "+price+"\nColor is: "+color+"\n===========";
	}	
}