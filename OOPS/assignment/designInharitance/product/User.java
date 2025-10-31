//package OOPS.assignment.designInharitance.product;

public class User {
    public static void main(String[] args) {
        
        Shirt s1 = new Shirt();
        Shirt s2 = new Shirt("t-shirt",1400,42,"white");
        String res = s2.getDetails();
        System.out.println(res);
    }
}
