

public class Driver {
    public static void main(String[] args) throws CloneNotSupportedException{
        Address a= new Address("bihar", "patna");

        Employ e= new Employ("rama", 101, a);
        System.out.println(e.a.city);
        Employ e1= (Employ)e.clone(); // shallow copy

        System.out.println(e1.a.city);
        System.out.println(e.a.city);

        e1.a.city= "madhubani";
         System.out.println(e1.a.city);
        System.out.println(e.a.city);
    }
    
}
