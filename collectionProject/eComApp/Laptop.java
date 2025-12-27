package collectionProject.eComApp;

public class Laptop extends Product{
     private final  int ram;
   private final String color;
   private final String hd;


    Laptop(String brand,String price,int ram,String color,String hd){
    super(brand, price);
    this.ram= ram;
    this.color= color;
    this.hd = hd;
   }

   public int getRam(){
    return ram;
   }

      
}
