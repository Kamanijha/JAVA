class Fruit{
	String name;
	int price;
	String color;
	double weight;
	Fruit(){        // default construtor
	}
	Fruit(String name){       // parametrized constructor
		this.name=name;
	}
	Fruit(int price){
		this.price=price;
	}
	Fruit(String name, int price){
		this.name=name;
		this.price=price;
	}
	Fruit(String name, int price, String color){
		this.name=name;
		this.price=price;
		this.color=color;
	}
	Fruit(String name, int price, String color, double weight){
		this.name=name;
		this.price=price;
		this.color=color;
		this.weight=weight;
	}
	public String getDetails(){                // getter method 
	return "Name is: "+name+"\nPrice is: "+price+"\nCOlor is: "+color+"\nWeight is: "+weight+"\n=====================";
	}	
}