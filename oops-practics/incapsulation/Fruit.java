

public class Fruit {
    private static  int price;

    // public  void setPrice(int price){
    //     if(price !=0 ){
    //         this.price = price;
    //     }else{
    //         System.out.println("price can  not be nagative number");
    //     }
    // }

    // public  int getPrice(){
    //     return price;
    // }

     public static void setPrice(int price){
        if(price !=0 ){
            Fruit.price = price;
        }else{
            System.out.println("price can  not be nagative number");
        }
    }

    public static int getPrice(){
        return price;
    }
}
