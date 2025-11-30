
import java.util.Objects;

public class Car implements Cloneable {
	String name;
	double price;
	String carno;
	
	Car(){
		
	}
	Car(String name, double price, String carno){
		this.name = name;
		this.price = price;
		this.carno = carno;
	}
	
	@Override
	public String toString() {
		return "Name is: "+name+"\tPrice is: "+price+"\tCar No is: "+carno;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		} else if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Car c=(Car) obj;
	return this.name.equals(c.name) && this.price == c.price && this.carno.equals(c.carno);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, price, carno);
	}
	
	@Override
	public Car clone() throws CloneNotSupportedException {
		return (Car)super.clone();
		//address a1=new address("MG Road", "Bangalore", 560001);
	}
	
	public void finalize() {
		//sc.close();
		//db.close();
		//file.close();
		//networkConnection.close();
		//resources.release();
		//resources.cleanup();
		System.out.println("finalize method called");
		System.out.println("finalize method is working to clean up resources");
		System.out.println("Releasing resources associated with the Car object...");
		System.out.println("Cleaning up resources...");
		System.out.println("finalize method completed");
		System.out.println("Car object is garbage collected");
		System.out.println("------------------------------");
	}
	

}








