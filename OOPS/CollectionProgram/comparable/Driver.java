
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		Shirt s1 = new Shirt("Levis", 2500.00, 32);
		Shirt s2 = new Shirt("Pepe", 2700.00, 34);
		Shirt s3 = new Shirt("Arrow", 3000.00, 30);
		Shirt s4 = new Shirt("Arrow", 2500.00, 32);
		Shirt s5 = new Shirt("Pepe", 2200.00, 34);
		Shirt s6 = new Shirt("Levis", 3000.00, 30);
		
		List<Shirt> l1 = new ArrayList<>();
		l1.add(s1);	l1.add(s2);l1.add(s3);l1.add(s4);l1.add(s5);l1.add(s6);
		System.out.println("Before Sorting: ");
		for (Shirt s : l1) {
			System.out.println(s);
		}
		Collections.sort(l1);
		
		System.out.println("After Sorting: ");
		for (Shirt s : l1) {
			System.out.println(s);
		}
	}

}