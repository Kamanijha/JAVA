//package OOPS.upcastingDowncastingProgram;
    import java.util.*;
public class AnimalDriver {
	public static void main(String[] args) {
		List<PetAnimal> l1=new ArrayList<>();
		List<wildAnimal> l2 = new ArrayList<>();
		l1.add(new Cow());
		l1.add(new Dog());
		l1.add(new Rat());
		l1.add(new Cat());
		l2.add(new Lion());
		l2.add(new Tiger());
		l1.add(new Cow());
		l1.add(new Cow());
		l2.add(new Tiger());
		l1.add(new Rabbit());
		System.out.println(l1);
		System.out.println("===========");
		System.out.println(l2);
		
	}

}
