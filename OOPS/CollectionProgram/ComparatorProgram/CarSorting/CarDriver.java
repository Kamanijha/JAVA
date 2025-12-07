

import java.util.*;
public class CarDriver {
	public static void main(String[] args) {
		List<Car> cars=new ArrayList<>();
		cars.add(new Car("BMW", 5000000.3, 400));
		cars.add(new Car("Audi", 6000000, 350));
		cars.add(new Car("BMW", 5000000.2, 350));
		cars.add(new Car("Jagu", 8000000, 500));
		cars.add(new Car("Audi", 5500000, 300));
		cars.add(new Car("Toyo", 3000000, 250));
		cars.add(new Car("Audi", 2800000, 220));
		
		System.out.println("---------All cars---------");
		for(Car c:cars) {
			System.out.println(c);
		}
		
		System.out.println("---------All cars Sorted On price---------");
		//Collections.sort(cars, (c1,c2)->(int)(c1.price-c2.price));
	Collections.sort(cars, (a,b)->a.price==b.price?0:a.price>b.price?1:-1);
		for(Car c:cars) {
			System.out.println(c);
		}
		System.out.println("---------All cars Sorted on Name---------");
		Collections.sort(cars, (a,b)->a.name.compareToIgnoreCase(b.name));
		for(Car c:cars) {
			System.out.println(c);
		}
		System.out.println("---------All cars Sorted on HP---------");
		Collections.sort(cars, (a,b)->a.hp-b.hp);
		for(Car c:cars) {
			System.out.println(c);
		}
		
	}

}