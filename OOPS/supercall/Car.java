//package OOPS.supercall;

public class Car extends Vehical{
    int hp;
    int strokes;
    Car(){}
    Car(String name,double price ,String color,int hp,int strokes){
        super.name = name;
        super.price = price;
        super.color  = color;
        this.hp = hp;
        this.strokes = strokes;
    }

    public String getDetails(){
        return super.getDetails()+ "\nhp is : "+ hp+ "\nstrokes is: "+ strokes;
    }
}
