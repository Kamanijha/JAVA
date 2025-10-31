//package OOPS.assignment.designInharitance.product;

public class Shirt extends Product{
    int price ;
    int size ;
    String color;

    Shirt(){

    }
    Shirt(String name,int price,int size,String color){
        super.name = name;
        this.price = price;
        this.size= size;
        this.color= color;

    }

    public String getDetails(){
        return super.getDetails()+"\n price is :" + price+"\n size is :" + size+ "\ncolor is :" + color;
    }
}
