import java.util.Scanner;
class EmployDriver{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Employ e1=new Employ();
		System.out.println("Enter the Name: ");
		String name1=sc.nextLine();
		System.out.println("Enter the Age: ");
		int age1=sc.nextInt();
		System.out.println("Enter the Salary: ");
		double salary1=sc.nextDouble();
		
		e1.setName(name1);
		e1.setAge(age1);
		e1.setSalary(salary1);

		System.out.println("=====Details Are=======");
		System.out.println("Name is: "+e1.getName());
		System.out.println("Age is: "+e1.getAge());
		System.out.println("Salary is: "+e1.getSalary());
	}
}