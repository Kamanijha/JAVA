import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopDriver {
    public static void main(String[] args) {
        Laptop l1 = new Laptop(34000,"dell",8 );
        Laptop l2 = new Laptop(120000,"mac",8 );
        Laptop l3 = new Laptop(40000,"hp",16 );
        Laptop l4 = new Laptop(200000,"macBookPro",16 );
        Laptop l5 = new Laptop(45000,"lenvo",8 );

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(l1);laptops.add(l2);laptops.add(l3);laptops.add(l4);laptops.add(l5);

        // Collections.sort(laptops,Comparator.comparing((Laptop l)->l.brand).thenComparingInt((l)->l.ram).thenComparingInt((l)->l.price));

        Collections.sort(laptops, new SortAscendingOrder());

        for (Laptop i : laptops) {
            System.out.println(i);
        }
    }
}
