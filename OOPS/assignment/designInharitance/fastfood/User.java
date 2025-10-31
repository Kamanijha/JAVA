//package OOPS.assignment.designInharitance.fastfood;

public class User {
    public static void main(String[] args) {
        
        Pizza p = new Pizza();
        Pizza p2 = new Pizza("Cheese Burst", 399, "Medium", "Extra Cheese", "Thin");
        String res = p2.getDetails();
        System.out.println(res);
    }
}
