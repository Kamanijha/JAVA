
public class Register<T, U> {
	T t;
	U u;
	Register(T t, U u){
		this.t=t;
		this.u=u;
	}
	
	public void display() {
		System.out.println("1st detail is: "+t+"\t 2nd details is: "+u);
	}
	
	public String toString() {
	return "1st detail is: "+t+"\t 2nd details is: "+u;
	}
	
	public  Register<T, U>   get() {
		return new Register<T, U>(t, u);
	}

}
