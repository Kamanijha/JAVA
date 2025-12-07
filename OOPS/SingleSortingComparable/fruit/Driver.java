import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        
        Fruit f1 = new Fruit(120,"apple","red");
        Fruit f2 = new Fruit(200,"orage","pink");
        Fruit f3 = new Fruit(200,"banana","yelloww");
        Fruit f4 = new Fruit(200,"papaya","loghtYellow");
        Fruit f5 = new Fruit(520,"mango","yellow");

        List<Fruit> l= new ArrayList<>();
        l.add(f1);l.add(f2);l.add(f3);l.add(f4);l.add(f5);
        System.out.println("before sorting ============");
        for (Fruit f : l) {
            System.out.println(f);
        }
        Collections.sort(l);
        System.err.println("after sortig==================");
        for (Fruit f : l) {
            System.out.println(f);
        }
    }
}
