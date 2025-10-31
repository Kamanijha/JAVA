//package OOPS.assignment.designInharitance.product;

public class Product {
    String name ;
    Product(){

    }
    Product(String name){
        this.name = name;
    }

    public String getDetails(){
        return "name is : " + name;
    }
}
