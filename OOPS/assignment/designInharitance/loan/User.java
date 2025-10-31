//package OOPS.assignment.designInharitance.loan;

public class User {
    public static void main(String[] args) {
        Personal p = new Personal();
        Personal p1 = new Personal(20000000,10.0,"eduction","farmer");
        String res= p1.getDetails();
        System.out.println(res);

    }
}
