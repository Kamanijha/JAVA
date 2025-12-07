import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        
        Laptop l1 = new Laptop("hp", 12000 , 70);
        Laptop l2 = new Laptop("lanove", 30000 , 40);
        Laptop l3 = new Laptop("dell", 20000 , 40);
        Laptop l4 = new Laptop("mac", 12000 , 20);

        List<Laptop> list = new ArrayList<>();
        list.add(l1) ;list.add(l2);list.add(l3);list.add(l4);
        System.out.println("before sorting ========= ********");
        for (Laptop  l : list) {
            System.out.println(l);
        }
        Collections.sort(list);

        System.out.println("after sorting =========***********");
        for (Laptop  l : list) {
            System.out.println(l);
        }
    }
}
