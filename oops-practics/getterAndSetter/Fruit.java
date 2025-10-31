class Fruit{

    String name;
    int price;
    String color;
    
    public void SetDetails(String name, int price,String color){
        this.name= name;
        this.price = price;
        this.color = color;
    }

    public String getDetails(){
        return "name is :" + name + "price is : " + price+ "color is :" + color;
    }
}