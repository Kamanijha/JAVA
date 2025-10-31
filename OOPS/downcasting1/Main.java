//package OOPS.downcasting1;

public class Main {
    public static void main(String[] args) {
        
        Browser b1 = new Chrome(); // upcasting
        System.out.println(b1.a);
         System.out.println("=====================");
        Chrome c1 = (Chrome)b1;  // down caating 
        System.out.println(c1.b);

        System.out.println("=======****************");
        Browser b2 = new Firefox();  // upcaating 
        System.out.println(b2.a);
        System.out.println("*************");
        Firefox f1 = (Firefox)b2;  // down caating 
        System.out.println(f1.c);
    }
}
