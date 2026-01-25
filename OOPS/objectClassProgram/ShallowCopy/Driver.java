

public class Driver {
    public static void main(String[] args) throws CloneNotSupportedException {
		Employ e1=new Employ("Mohan", 121, new Address("Noida", "UP"));
		System.out.println(e1);
		System.out.println(e1.a);
		System.out.println("==============");
		Employ e2= e1.clone();
		System.out.println(e2);
		System.out.println(e2.a);
		System.out.println("====Address Before Changes======");
		System.out.println("E1 city is: "+e1.a.city);
		System.out.println("E2 city is: "+e2.a.city);
		System.out.println("====Address After Changes======");
		e2.a.city="Kanpur";
		System.out.println("E1 city is: "+e1.a.city);
		System.out.println("E2 city is: "+e2.a.city);
	}
}
