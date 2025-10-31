import java.util.Scanner;
class LaptopDriver{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("enter name: ");
        String name1 = sc.nextLine();

        Laptop l1 = new Laptop();
        l1.setDetails(name1);
        System.out.println(l1.getDetails());
    }
}