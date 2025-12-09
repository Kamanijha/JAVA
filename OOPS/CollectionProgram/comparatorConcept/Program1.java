package OOPS.CollectionProgram.comparatorConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
		
		
		List<Integer> l1=new ArrayList<>();
		l1.add(5);l1.add(2);l1.add(8);l1.add(1);l1.add(4);
		System.out.println("Before Sorting: "+l1);
		Collections.sort(l1, (a,b)->b-a);
		System.out.println("After Sorting: "+l1);
	}
}
