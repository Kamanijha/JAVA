package factoryMethodProject;

import java.util.Scanner;

public class Service {
    
    public Vehicle getVehicle(){
        Scanner sc = new Scanner(System.in);

        System.err.println("press 1 => for new game game ");
        System.err.println("press 2 => for new setting ");
        System.err.println("press 3 => for new exist");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("you are selected car");
                return new Car();
             case 2:
             System.out.println("you are selected Bike");
                return new Bike();   
             case 3:
             System.out.println("you are selected bus");
                return new Bus();
            default:
            System.out.println("invalid selection");
            return getVehicle();
        }
        
    }
}
