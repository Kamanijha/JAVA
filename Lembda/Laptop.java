public class Laptop {
    int price;String brand;int ram;

    Laptop(int price,String brand,int ram){
        this.price= price;
        this.brand= brand;
        this.ram= ram;
    }

    public String toString(){
        return price + " " + brand + " "+ ram;
    }
}
