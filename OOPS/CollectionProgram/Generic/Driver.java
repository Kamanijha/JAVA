
public class Driver {
	public static void main(String[] args) {
		Box b1=new Box(12);
		Box<Integer> b2=new Box<>(30);
		Box<Double> b3=new Box<>(23.8);
		Box<String> b4=new Box<>("abc");
		Box b5=new Box("xyzp");
		System.out.println(b1.get());
		System.out.println(b2.get());
		System.out.println(b5.get());
		System.out.println(((String)b5.get()).length());
		System.out.println(((String)b5.get()).toUpperCase());
		System.out.println("===========================");
		System.out.println(b4.get());
		System.out.println(b4.get().length());
		System.out.println(b4.get().toUpperCase());
		
	}

}