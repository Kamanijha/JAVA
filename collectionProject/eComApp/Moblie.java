package collectionProject.eComApp;

public class Moblie extends Product{
    private final  int ram;
   private final String color;
   private final String hd;

   
   Moblie(String brand,String price,int ram,String color,String hd){
    super(brand, price);
    this.ram= ram;
    this.color= color;
    this.hd = hd;
   }

}
