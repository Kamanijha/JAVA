//package OOPS.upcastingDowncastingProgram;

public class Driver {
    public static void main(String[] args) {
        Object o1 = new Car();
        Vehicle v1 = (Vehicle)o1;
        System.out.println(v1.v);
        Car c1 = (Car) o1;
        System.out.println(c1.c);
    }
}
