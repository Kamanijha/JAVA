
public class Employee implements Comparable<Employee> {
    int salary;
    int id;
    String name;

    Employee(int salary, int id, String name) {
        this.salary = salary;
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "salary is :" + salary + "\nid is : " + id + "\nname is : " + name + "\n";
    }

    // sorting on salary
    // public int compareTo(Employee o){
    // return this.salary-o.salary;
    // }

    // sorting name
    // public int compareTo(Employee o){
    // return this.name.compareTo(o.name);
    // }

    // sorting salary if salary is same then sort on name if name is same then sort
    // on id
    public int compareTo(Employee o) {
        if (this.salary == o.salary) {
            if (this.name.equals(o.name)) {
                return this.id - o.id;
            }
            return this.name.compareTo(o.name);
        }
        return this.salary - o.salary;
    }

    // this is good code practice
    // @Override
    // public int compareTo(Employee o) {

    // int salaryCompare = Integer.compare(this.salary, o.salary);
    // if (salaryCompare != 0) {
    // return salaryCompare;
    // }

    // int nameCompare = this.name.compareTo(o.name);
    // if (nameCompare != 0) {
    // return nameCompare;
    // }

    // return Integer.compare(this.id, o.id);
    // }

}