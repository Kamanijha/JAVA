//package OOPS.inharitance.implicit;

public class Drive extends Vehicle {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Tesla";
        c1.color = "Red";
        c1.wheels = 4;

        c1.start();          // inherited from Vehicle
        c1.showCarDetails(); // defined in Car
    }
}



