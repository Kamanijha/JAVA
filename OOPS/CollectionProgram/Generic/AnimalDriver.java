
import java.util.*;
public class AnimalDriver {
	public static void main(String[] args) {
		Animal a1=new Animal();
		PetAnimal p1=new PetAnimal();
		Dog d1=new Dog();
		Pug pg1=new Pug();
		Table t1=new Table();
		
		ArrayList<Object> list1=new ArrayList<>();
		list1.add(a1);list1.add(p1);list1.add(d1);list1.add(pg1);list1.add(t1);
		
		ArrayList<Animal> list2=new ArrayList<>();
		list2.add(a1);list2.add(p1);list2.add(d1);list2.add(pg1);
		
		ArrayList<PetAnimal> list3=new ArrayList<>();
		list3.add(p1);list3.add(d1);list3.add(pg1);
		
		ArrayList<Dog> list4=new ArrayList<>();
		list4.add(d1);list4.add(pg1);
		
		ArrayList<Pug> list5=new ArrayList<>();
		list5.add(pg1);
		
		eat(list1);
		eat(list2);
		eat(list3);
		eat(list4);
		eat(list5);
		
		
		
		
	}
	//UnboundedType
	public static void eat(ArrayList<? extends Animal> a) {
		System.out.println("Animal is eating");
	}
	//UpperboundedType
	/*public static void eat(ArrayList<? extends PetAnimal> a) {
		System.out.println("Animal is eating");
	}*/
	//LowerboundedType
	/*public static void eat(ArrayList<? super PetAnimal> a) {
		System.out.println("Animal is eating");
	}*/

}




