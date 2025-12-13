
import java.util.*;
public class LaptopDriver {
	public static void main(String[] args) {
		Laptop l1=new Laptop("Dell", 8, 45000, 512);
		Laptop l2=new Laptop("HP", 16, 55000, 1024);
		Laptop l3=new Laptop("Apple", 8, 95000, 256);
		Laptop l4=new Laptop("Asus", 32, 75000, 2048);
		Laptop l5=new Laptop("Acer", 16, 35000, 512);
		List<Laptop> laptops=new ArrayList<>();
		Collections.synchronizedList(laptops);//if synchronization is required
		laptops.add(l1);laptops.add(l2);
		laptops.add(l3);laptops.add(l4);laptops.add(l5);
		System.out.println("Before Sorting:");
		for(Laptop l:laptops)
			System.out.println(l);
		
		Collections.sort(laptops);
		System.out.println("After Sorting:");
		for(Laptop l:laptops)
			System.out.println(l);
		
	}

}
