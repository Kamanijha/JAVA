package collectionProject.eComApp;

public class Shirt extends Product{
  private final  int size;
   private final String color;
   private final String type;

  public Shirt(String price,String brand,int size,String color,String type){
    super(brand, price);
    this.size = size;
    this.color= color;
    this.type= type;
  }

  public int getSize(){
    return size;
  }

  public String getColor(){
    return color;
  }

  public String getType(){
    return type;
  }
  
    
}
