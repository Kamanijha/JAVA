class Driver{

    public static void  main(String[] args){
        Car c1 = new Car();

        Engine e1 = new Engine(200,8,"petrol");
        c1.e = e1;   // this filed injection

        c1.e.displayDetails();

        Car c2 = new Car();
         Engine e2  = new Engine(400, 10,"petrol");
         c2.e = e2;       // filed injection
        c2.e.displayDetails();
    }
}