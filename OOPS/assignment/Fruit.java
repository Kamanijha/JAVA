class Fruit{

    int quantity ;
    double price;
    String name;

    public void setDetails(int a , double b , String c){
        quantity = a;
        price = b;
        name = c;
    }
    public String getDetails(){
        return "quantity is: " + quantity + "\n price is: " + "\n fruit name is: " + name +"\n========="; 

    }
}