import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        // List<Integer> l = new ArrayList<>();
        // l.add(12);l.add(62);l.add(10);l.add(1);
        // l.add(32);l.add(72);
        // l.add(52);l.add(18);
        // System.out.println(l);
        // System.out.println("after sorting================");
        // Collections.sort(l); // this is single sorting 
        // System.out.println(l);

        List<String> l = new ArrayList<>();
        l.add("apple");l.add("mango");l.add("litchi");l.add("banana");
        l.add("papaya");l.add("gawva");
        l.add("orange");l.add("apple");
        System.out.println(l);
         System.out.println("after sorting================");
        Collections.sort(l);
        System.out.println(l);
    }
}
