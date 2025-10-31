//package OOPS.methodOverloading;

public class Calculator {
    public static void add(int a , int b){
        System.out.println("int ,int adding");
        System.out.println("sum is :" + a+b);
    }

    public static void add(double a , int b){
        System.out.println("double ,int adding");
        System.out.println("sum is :" + a+b);
    }
    public static void add(int a , int b , double c){
        System.out.println("int ,int  and double is adding");
        System.out.println("sum is :" + a+b+c);
    }

    public static void add(int a , double b,  double c){
        System.out.println("int , double and double is  adding");
        System.out.println("sum is :" + a+b+c);
    }
    public static void add(int a , int b , int c){
        System.out.println("int ,int  int is adding");
        System.out.println("sum is :" + a+b+c);
    }
    public static void add(int a , double b){
        System.out.println("int ,int adding");
        System.out.println("sum is :" + a+b);
    }
    public static void add(double a , double b){
        System.out.println("int ,int adding");
        System.out.println("sum is :" + a+b);
    }
}
