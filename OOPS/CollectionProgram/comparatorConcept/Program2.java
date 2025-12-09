

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("Mohan");l1.add("John");l1.add("Rahul");l1.add("Mac");
		l1.add("Jethalal");l1.add("Pyarelal");l1.add("Champak Lal");
		l1.add("Babita");l1.add("Tappu");
		l1.add("jack");
		System.out.println("Before Sorting: "+l1);
		//Collections.sort(l1, (a,b)->a.compareToIgnoreCase(b));
		Collections.sort(l1, (a,b)->b.length()-a.length());
		System.out.println("After Sorting: "+l1);
	}
}
