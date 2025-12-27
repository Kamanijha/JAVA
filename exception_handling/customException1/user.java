

import java.util.Scanner;

public class user {
    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter balance :");
        int bal =   sc.nextInt();

         System.out.println("enter withdrawAmount :");
        int withdrow =   sc.nextInt();
        try {
             accountBalance.CheckBalance(bal,withdrow);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }
}
