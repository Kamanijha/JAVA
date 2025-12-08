public class Phone {
    double price;
    String brand;
    String color;
    String RAM;

    Phone(double price,String brand,String color,String RAM){
        this.price = price;
        this.brand = brand;
        this.color = color;
        this.RAM = RAM;
    }

    public String toString(){
        return "price is : " + price+" brand is : " + brand + " color is : " + color + " ram is :" + RAM;
    }
    
}
