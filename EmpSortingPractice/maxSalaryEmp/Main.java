

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> e= new ArrayList<>();
        e.add(new Employee(101,"raman",30000));
        e.add(new Employee(102,"rohan",120000));
        e.add(new Employee(102,"ramesh",120000));
        e.add(new Employee(102,"ramau",7000));
        e.add(new Employee(103,"ram",5000));
        // minSalary( e);
        //secondMaxSalary(e);
        secondMinSalary(e);

    }
    public static void maxSalary(ArrayList<Employee> e){
        Employee max = e.get(0);
        for (Employee emp : e) {
            if(emp.salary > max.salary){
                max = emp;
            }
        }
        System.out.println(max.id + " " + max.name + " " + max.salary);
    }

     public static void secondMaxSalary(ArrayList<Employee> e){
        Employee max = e.get(0); Employee secondmax = e.get(0);
        for (Employee emp : e) {
            if(emp.salary > max.salary){
                secondmax = max;
                max = emp;
            }else if(emp.salary > secondmax.salary && emp.salary != max.salary){
                secondmax = emp;
            }
        }
        System.out.println(secondmax.id + " " + secondmax.name + " " + secondmax.salary);
    }


    public static void minSalary(ArrayList<Employee> e){
        Employee min = e.get(0);
        for (Employee emp : e) {
            if(emp.salary < min.salary){
                min = emp;
            }
        }
        System.out.println(min.id + " " + min.name + " " + min.salary);
    }

    public static void secondMinSalary(ArrayList<Employee> e){
        Employee min = e.get(0); Employee secondmin = e.get(0);
        for (Employee emp : e) {
            if(emp.salary < min.salary){
                secondmin = min;
                min = emp;
            }else if(emp.salary < secondmin.salary && emp.salary != min.salary){
                secondmin = min;
            }
        }
        System.out.println(secondmin.id + " " + secondmin.name + " " + secondmin.salary);
    }
}
