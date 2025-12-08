import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        List<Phone> p = new ArrayList<>();
        p.add(new Phone(120000, "Apple", "Black", "4GB"));
        p.add(new Phone(85000, "Samsung", "Blue", "8GB"));
        p.add(new Phone(45000, "Xiaomi", "White", "6GB"));
        p.add(new Phone(65000, "OnePlus", "Red", "12GB"));
        p.add(new Phone(30000, "Vivo", "Gold", "8GB"));

        // for (Phone phone : p) {
        // System.out.println(phone);
        // }

        // sort on price
        Collections.sort(p, (a, b) -> a.price == b.price ? 0 : a.price > b.price ? 1 : -1);
        // for (Phone phone : p) {
        // System.out.println(phone);
        // }

        // sorting on the name of product

        Collections.sort(p, (a, b) -> a.brand.compareToIgnoreCase(b.brand));
        // for (Phone phone : p) {
        // System.out.println(phone);
        // }

        // sorting on the basis of RAM
        Collections.sort(p, (a, b) -> a.RAM.compareToIgnoreCase(b.RAM));
        for (Phone phone : p) {
            System.out.println(phone);
        }
    }
}
