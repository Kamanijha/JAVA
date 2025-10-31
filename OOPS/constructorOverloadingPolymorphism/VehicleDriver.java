//package OOPS.constructorOverloadingPolymorphism;

public class VehicleDriver {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle(23);
        Vehicle v3 = new Vehicle(45.6);
        Vehicle v4 = new Vehicle("hello");
        Vehicle v5 = new Vehicle('@');

    }
}
