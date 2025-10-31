class CarEngineDriver{

    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car();

        c1.name="TATA";
		c2.name="Maruti";
		System.out.println("=======Car1 details============");
		System.out.println("Car Obj ref: "+c1);
		System.out.println("Car Engine Obj ref: "+c1.e);
		System.out.println("Car Name is: "+c1.name);
		System.out.println("Car Engine HP is: "+c1.e.hp);
		System.out.println("Car Engine Strokes is: "+c1.e.strokes);
		System.out.println("Car Engine Type is: "+c1.e.type);
		c1.e.start();
		System.out.println("=======Car2 details============");
		System.out.println("Car Obj ref: "+c2);
		System.out.println("Car Engine Obj ref: "+c2.e);
		System.out.println("Car Name is: "+c2.name);
		System.out.println("Car Engine HP is: "+c2.e.hp);
		System.out.println("Car Engine Strokes is: "+c2.e.strokes);
		System.out.println("Car Engine Type is: "+c2.e.type);
		c2.e.start();
    }
}