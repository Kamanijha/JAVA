
import java.util.ArrayList;
public class Program1 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		System.out.println(a1);
		a1.add(10);
		a1.add(20.5);
		a1.add('A');
		a1.add("Hello");
		System.out.println(a1);
		System.out.println(a1.get(0));
		System.out.println(((Integer)a1.get(0))+100);
		System.out.println("====================");
			Object o1=a1.get(0);
			System.out.println((Integer)o1+100);
		System.out.println("=================");
		Integer x=(Integer)a1.get(0);
		System.out.println(x+100);
		System.out.println("=====================");
		System.out.println(a1.get(3));
		System.out.println((String)a1.get(3)+100);
		System.out.println("========================");
		System.out.println(a1.get(1));
		System.out.println((Double)a1.get(1)+100);
	}

}
