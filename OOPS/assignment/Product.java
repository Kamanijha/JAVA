class Product{
    String name;
    String brand;
    int size;

    public void setDetails(String a,String b,int c){
        name = a;
        brand = b;
        size = c;
    }

    public String getDetails(){
        return "product name is :" + name +" \n brand is :" + brand + "\n size is :"+ size + "\n============";
    }
}