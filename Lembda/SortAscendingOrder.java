import java.util.Comparator;

public class SortAscendingOrder implements Comparator<Laptop>{
    // public int Compare(Laptop l1,Laptop l2){
    //     if(l1.brand.equalsIgnoreCase(l2.brand))
    //         ///return Integer.compare(l1.ram, l2.ram);
    //             return l1.price == l2.price ? 0:l1.price > l2.price ?1:-1;
    //         return l1.brand.compareToIgnoreCase(l2.brand);

        
    // }

    @Override
    public int compare(Laptop l1, Laptop l2) {

        // 1️⃣ Compare brand
        int brandCompare = l1.brand.compareToIgnoreCase(l2.brand);
        if (brandCompare != 0) {
            return brandCompare;
        }

        // 2️⃣ If brand same → compare RAM
        int ramCompare = Integer.compare(l1.ram, l2.ram);
        if (ramCompare != 0) {
            return ramCompare;
        }

        // 3️⃣ If RAM same → compare price
        return Integer.compare(l1.price, l2.price);
    }
    
}
