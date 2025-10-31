class CarDriver{

    public static void main(String[] args){
        System.out.println("========program start========");
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        Car.brand = "maruti";
        //Car.brand = "MG";
        System.out.println("car brand is :" + Car.brand);
        Car.test();

        System.out.println("===================");
		System.out.println("Car1 brand is: "+c1.brand);
		Car.test();
		System.out.println("Car2 brand is: "+c2.brand);
		c2.test();
		System.out.println("Car3 brand is: "+c3.brand);
		c3.test();
		System.out.println("====Program Ends!====");
    }
}