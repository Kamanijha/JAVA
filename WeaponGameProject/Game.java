

import java.util.Scanner;
public class Game {

    {
    System.out.println("game sateted now ");
    }

    public Weapon selectWeapon(){     // this is factory method
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the score");
        int score = scanner.nextInt();

        if(score <= 400){
            System.out.println("you got knife");
            Knife k = new Knife();
            return k;
        }else if(score <= 800){
            System.out.println("press 1 => knife and 2 for => gun");
            int choice = scanner.nextInt();
            switch(choice){
                case 1: System.out.println("you have selected knife");
                return new Knife();
                case 2:
                 System.out.println("you have selected gun");
                return new Gun();
                default:
                System.out.println("invalid option");
                return selectWeapon();
            }
            
        }else{
            System.out.println("press 1 => knife and 2 => gun  and bomb => 3");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                System.out.println("you have selected the knife ");
                return new Knife();
                case 2:
                System.out.println("you have selected the gun ");
                return new Gun();
                case 3:
                System.out.println("you have selected the Bomb ");
                return new Bomb();
                default:
                System.out.println("invalid selecytion ");
                return selectWeapon();
            }
           
        }
    }
}
