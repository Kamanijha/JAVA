//package OOPS.downcasting;

public class Main {
    public static void main(String[] args) {
        
        Fruit f1 = new Apple();  // upcasting 
        Fruit f2= new Mango();   // upcasting 
          System.out.println(f2.x);
        // System.out.println(f1.x);
        //System.out.println(f1.z);

        Mango m1 = (Mango)f2;  // downcasting  access spsecial feature of child class 
        System.out.println(m1.y);  
        System.out.println("====================");
        Apple a1 = (Apple)f1;  // downcasting access special feature of child class 
        System.out.println(a1.z);
    }
}
