import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductDriver {
    public static void main(String[] args) {

        List<Product> product = new ArrayList<>();
        product.add( new Product(1200,"shirt",12));
        product.add( new Product(1000,"tshirt",13));
        product.add( new Product(1234,"pant",14));
        product.add( new Product(1290,"jeans",15));
        product.add( new Product(1380,"jackect",16));
        product.add( new Product(1208,"swter",17));
        product.add( new Product(1500,"blazer",18));
        
    

    // for(Product p: product){
    //     System.out.println(p);
    // }
   

    // sorting on this pric of product
    Collections.sort(product,(a,b)->a.price == b.price?0:a.price > b.price?1:-1);

    // for(Product p : product){
    //     System.out.println(p);
    // }
    // sort on this name of product

    Collections.sort(product,(a,b)->a.name.compareToIgnoreCase(b.name));
    // for (Product p : product) {
    //     System.out.println(p);
        
    // }
    // sorted on id this product
    Collections.sort(product,(a,b)->a.id-b.id);
    for(Product p : product){
        System.out.println(p);
    }
}
}
