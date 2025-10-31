//package OOPS.assignment.designInharitance.fastfood;

public class Fastfood {
    String name ;
    int price ;

    Fastfood(){

    }

    Fastfood(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String  getDetails(){
        return "name is : "+ name + "\n price is :" + price;
    }
}
