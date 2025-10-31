class Fruit{
	String name;
	int price;
	String color;
	double weight;
	Fruit(){
	}
	Fruit(Fruit p){
		this(p.name, p.price, p.color, p.weight);
		//OR this.name=p.name; this.price=p.price; and so on..
	}
	Fruit(String name){
		this();
		this.name=name;
	}
	Fruit(int price){
		this.price=price;
	}
	Fruit(String name, int price){
		this(name);
		this.price=price;
	}
	Fruit(String name, int price, String color){		
		this(name, price);
		this.color=color;
	}
	Fruit(String name, int price, String color, double weight){
		this(name, price, color);	
		this.weight=weight;
	}
	public String getDetails(){
	return "Name is: "+name+"\nPrice is: "+price+"\nCOlor is: "+color+"\nWeight is: "+weight+"\n=====================";
	}	
}