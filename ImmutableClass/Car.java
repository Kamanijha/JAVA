

public final class Car {
    private final String name;
    private final String color;
    private final int price;

    private Car(String name,String color,int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }

    // factory method 
    public static Car createCar(String name, String color,int price){
       return new Car(name,color,price);
    }
    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public int getprice(){
        return price;
    }
}
