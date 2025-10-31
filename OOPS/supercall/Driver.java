//package OOPS.supercall;

public class Driver {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("tesla", 23456779,"red",8,120);
        System.out.println(c2.getDetails());
        System.out.println(c1.getDetails());
    }
}
