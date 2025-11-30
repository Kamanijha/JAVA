class Employ{
	private String name;
	private int age;
	private double salary;

	
	public void setName(String name){
		if(name.matches("[A-Za-z\s]+"))
			this.name=name;
		else
			System.out.println("Invalid Name");
	}


	public void setAge(int age){
		if(age>=18 && age<=65)
			this.age=age;
		else
			System.out.println("Invalid Age");
	}


	public void setSalary(double salary){
		if(salary>=10000)
			this.salary=salary;
		else
			System.out.println("Invalid Salary");
	}

	public String getName(){
		//validate
	return name;
	}


	public int getAge(){
		//validate
	return age;
	}


	public double getSalary(){
		//validate
	return salary;
	}
}