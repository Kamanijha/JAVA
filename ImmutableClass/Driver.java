

public class Driver {
    public static void main(String[] args) {
        
        Car c1 = Car.createCar("tata","white" ,234566);
        Car c2 = Car.createCar("bmw","black" ,203449);
        System.out.println(c1.getName());
        System.out.println(c2.getName());
    }
}
