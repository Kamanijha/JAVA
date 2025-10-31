class Product{

    String name;
    int price;
    String brand;

    Product(){

    }
    Product(String name, int price, String brand){
        this.name = name;
        this.price= price;
        this.brand = brand;
    }

    public void buy(){
        System.out.println("buy the product");
    }
}