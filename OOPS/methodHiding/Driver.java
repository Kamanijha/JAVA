

public class Driver {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        System.out.println(v1.x); // 30
        System.out.println(v1.a);   // 89
        v1.drive();    // drive vehicle
        v1.test();     // drive car
       System.out.println("=========================");
        Car c = (Car)v1;     // down casting
        System.out.println(c.x); // 45
        System.out.println(c.a); // 90
        c.drive();  //  drive car
        c.test(); // test car  // parant method is hidden that is called method hiding
        System.out.println("==========================");
        Vehicle v2 = new FourWheeler();
        System.out.println(v2.a); // 89
        System.out.println(v2.x); // 30 
        FourWheeler f = (FourWheeler)v2;     // down casting
        System.out.println(f.a); // 60
        System.out.println(f.x); // 20


    }
}
