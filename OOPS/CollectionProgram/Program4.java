
import java.util.ArrayList;
import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Collection<Integer> c1 = new TreeSet<>();
        c1.add(12);
        c1.add(23);
        c1.add(40);
        c1.add(46);
        c1.add(23);
        c1.add(50);
        System.out.println(c1);
        System.out.println(c1.size());
        System.out.println(c1.contains(41));
    }

}
