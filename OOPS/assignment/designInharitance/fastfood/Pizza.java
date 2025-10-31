//package OOPS.assignment.designInharitance.fastfood;

public class Pizza extends Fastfood{
    String size;
    String toppings;
    String crustType;
    

    Pizza(){

    }

    Pizza(String name,int price ,String size,String toppings,String crustType){
        super.name = name;
        super.price = price;
        this.size = size;
        this.toppings = size;
        this.crustType = crustType;
    }

    public String  getDetails(){
        return super.getDetails()+"\nsize is : " + size+ "\ntoppings is :" + toppings + "\n crustType is :" + crustType;
    }

}
