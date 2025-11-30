
public class CarDriver {
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Car car1 = new Car("BMW", 5000000, "KA01AB1234");
		Car car2 = new Car("Audi", 6000000, "KA02CD5678");
		Car car3 = new Car("BMW", 5000000, "KA01AB1234");
		Car car4 = new Car("BMW", 5000000, "KA01AB1234");
		System.out.println(car1);
		
		System.out.println("======getClass()======");
		System.out.println("car1 class: " + car1.getClass());
		System.out.println("car2 class: " + car2.getClass().getName());
		Class c=car1.getClass();
		System.out.println("car1 class name: " + c.getName());
		System.out.println("===============toString()==============");
		System.out.println(car1);
		System.out.println(car1.toString());
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);
		System.out.println("===============equals()==============");
		System.out.println(car1==car2);
		System.out.println(car1==car3);
		System.out.println(car1==car4);
		System.out.println(car3==car4);
		System.out.println("=============");
		System.out.println(car1.equals(car2));
		System.out.println(car1.equals(car3));
		System.out.println(car1.equals(car4));
		System.out.println(car3.equals(car4));
		System.out.println("=============hashCode()=============");
		System.out.println("car1 hashcode: " + car1.hashCode());
		System.out.println("car2 hashcode: " + car2.hashCode());
		System.out.println("car3 hashcode: " + car3.hashCode());
		System.out.println("car4 hashcode: " + car4.hashCode());
		
		
		System.out.println("=============clone()=============");
		Car c1=car1.clone();
		System.out.println("Original Car: " + car1);
		System.out.println("Cloned Car: " + c1);
			
		
		System.out.println("=============finalize()=============");
		car1 = null;
		car2 = null;
		System.gc(); // Requesting JVM to run Garbage Collector
		
	
	}

}

