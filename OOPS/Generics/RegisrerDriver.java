
public class RegisrerDriver {
    
	public static void main(String[] args) {
		Register<Integer, String> r1=new Register<>(101, "Mohan Singh");
		System.out.println(r1);
		r1.display();
		System.out.println(r1.get().t+"\t==>\t"+r1.get().u);
	}

}

