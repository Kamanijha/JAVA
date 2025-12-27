public abstract  class Product implements Buyable{
    private final  String brand;
    private String price;

    public Product(String brand,String price){
        this.brand= brand;
        this.price = price;
    }


    public String getBrand(){
        return brand;
    }

    public String getPrice(){
        return price;
    }
}
