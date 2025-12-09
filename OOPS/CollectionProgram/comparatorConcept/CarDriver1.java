package OOPS.CollectionProgram.comparatorConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarDriver1 {
    public static void main(String[] args) {
		List<Car> cars=new ArrayList<>();
		cars.add(new Car("BMW", 5000000.3, 400));
		cars.add(new Car("Audi", 6000000, 350));
		cars.add(new Car("Audi", 5000000.2, 350));
		cars.add(new Car("Jagu", 8000000, 500));
		cars.add(new Car("Audi", 5500000, 300));
		cars.add(new Car("Toyo", 3000000, 250));
		cars.add(new Car("Audi", 5500000, 220));
		
		System.out.println("---------All cars---------");
		for(Car c:cars) {
			System.out.println(c);
		}
		System.out.println("------Sorintg on price then name then hp------");
		
		Collections.sort(cars, Comparator.comparingDouble((Car c)->c.price).thenComparing(c->c.name).thenComparingInt(c->c.hp).reversed());                                             
		for(Car c:cars) {
			System.out.println(c);
		}
	}
}
