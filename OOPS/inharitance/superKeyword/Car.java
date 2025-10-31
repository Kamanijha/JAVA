//package OOPS.inharitance.superKeyword;

public class Car extends Vehicle{
    int b = 50;
    int x = 90;
    public void start(){
        int c = 60;
        int x = 100;
        System.out.println(c);
        System.out.println(this.b);
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}
