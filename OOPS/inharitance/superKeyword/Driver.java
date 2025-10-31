//package OOPS.inharitance.superKeyword;

public class Driver {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.x);
        c.start();
        ((Vehicle)c).test();
        System.out.println(((Vehicle)c).x);
    }
}
