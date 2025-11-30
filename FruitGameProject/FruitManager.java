
import java.util.*;

public class FruitManager {

    public Fruits selectFruits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("press => 1 for mango");
        System.out.println("press => 2 for apple");
        System.out.println("press => 3 for banana");

        int choice = sc.nextInt();
        switch(choice) {
            case 1:
            System.out.println("you are selecetd mango");
            return new Mango();

            case 2:
            System.out.println("you are selecetd apple");
            return new Apple();

            case 3:
            System.out.println("you are selecetd banana");
            return new Banana();
            

            default:
            System.out.println("not available fruits");
            return selectFruits();
        }

    }
}
