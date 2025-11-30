import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("press => 1 for mango");
        System.out.println("press => 2 for apple");
        System.out.println("press => 2 for banana");
        int choice = sc.nextInt();
        String fruitName = "";
        switch (choice) {
            case 1:
            fruitName ="mango";
            System.out.println("you are selected mango");
              break;
            case 2:
            fruitName = "apple";
            System.out.println("you are selected apple");
              break;  
            case 3:   
            fruitName = "banana";
            System.out.println("you are selected banana");
              break;    
            default:
             System.out.println("out od stock");
                break;
            }
            
                if(!fruitName.equals("")){
                    FruitManager fruitmanager = new FruitManager();
                    Fruits f = fruitmanager.selectFruits();
                    f.eat();
                }

           
                     
        
    }
}
