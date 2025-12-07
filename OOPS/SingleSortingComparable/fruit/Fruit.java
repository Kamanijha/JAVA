
public class Fruit implements Comparable<Fruit>{

    int price;
    String type;
    String color;
    
    public Fruit(int price,String type,String color){
        this.price = price;
        this.type = type;
        this.color= color;
    }
    @Override
    public String toString() {
        
        return "[price=" + price + "\ttype=" + type + "\tcolor=" + color+ "]";
    }


    // sort by price 
    // public int compareTo(Fruit f){
    //     //if(this.price == f.price){
    //         return Integer.compare(this.price, f.price);
        
    // }
   
    // sort on color
    // public int compareTo(Fruit f){
    //     return this.color.compareTo(f.color);
    // }
    
    // sort on type
    // public int compareTo(Fruit f){
    //     return this.type.compareTo(f.type);
    // }
   
    // sort on price if price is same then sort on color if color is also same then compare on type;
    public int compareTo(Fruit f){
        if(this.price == f.price){
            if(this.color.equals(f.color)){
                 return this.type.compareTo(f.type);
            }
           
            return this.color.compareTo(f.color);
        }
        return Integer.compare(this.price, f.price);
    }
    
}
