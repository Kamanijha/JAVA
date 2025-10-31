//package OOPS.supercall;

public class Vehical {
    String name;
    double price;
    String color;

    Vehical(){

    }
    Vehical(String name,double price ,String color){
        this.name= name;
        this.price = price;
        this.color = color;
    }

    public String getDetails(){
        return "name is : " + name + "\nprice is :" + price + "\ncolor is : " + color;
    }
}
