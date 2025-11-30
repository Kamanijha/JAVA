package VendingMachineProject;

import java.util.Scanner;

public class VendingMachine {

    public Beverage  pressButton(){
        Scanner sc = new Scanner(System.in);
        System.out.println("press => 1 for cocke");
        System.out.println("press => 2 for juice");
        System.out.println("press => 3 for tea");

        int choice = sc.nextInt();
         switch (choice) {
            case 1:
                return new Cocke();
               
            case    
         
            default:
                break;
         }
    }
    
}
