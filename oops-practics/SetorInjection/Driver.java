

public class Driver {
    public static void main(String[] args) {
        Car c = new Car();

        Engine e1 = new Engine(200,8,"petrol");

        c.setEngine(e1);  // settor injection

        c.e.showDetails();
    }
}