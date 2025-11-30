import java.util.HashSet;

public class Porgram5 {
    public static void main(String[] args) {
        HashSet<Integer > hassSet = new HashSet<>();

        hassSet.add(23);
        hassSet.add(34);
        hassSet.add(256);
        hassSet.add(29);
        hassSet.add(20);
        hassSet.add(209);
     
        hassSet.add(234);
        hassSet.add(345);
        hassSet.add(23);

       for (Integer x : hassSet) {
            System.out.println(x);
       }
    }
}
