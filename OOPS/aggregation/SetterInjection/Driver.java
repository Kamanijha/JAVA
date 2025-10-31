class Driver{

    public static void main(String[] args){

        Car c1= new Car();
        Engine e1 = new Engine(200,8,"petrol");
        c1.setDetails(e1); // setter injection
        e1.displayDetails();
        Car c2 = new Car();

        Engine e2 = new Engine(240,8,"petrol");
        c2.setDetails(e2);
        e2.displayDetails();
    }
}