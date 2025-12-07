public class Employ implements Cloneable{
	String name;
	int id;
	Address a;
	
	Employ(String name, int id, Address a){
		this.name=name;
		this.id=id;
		this.a=a;
	}
	//shallow copy
	public Employ clone() throws CloneNotSupportedException{
		Employ e= (Employ)super.clone();
	return e;
	}

}