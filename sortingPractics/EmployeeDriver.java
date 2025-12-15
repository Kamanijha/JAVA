

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDriver {
    public static void main(String[] args) {
        // Employee e5 = new Employee(20000, 05, "neha");
        // Employee e1 = new Employee(20000, 01, "raman");
        //  Employee e6 = new Employee(16000, 06, "pooja");
        // Employee e2 = new Employee(15000, 02, "suman");
        //  Employee e3 = new Employee(18000, 03, "mohan");
        // Employee e4 = new Employee(14000, 04, "rohan");

        Employee e5 = new Employee(20000, 05, "suman");
        Employee e1 = new Employee(20000, 01, "suman");
         Employee e6 = new Employee(20000, 06, "suman");
        Employee e2 = new Employee(20000, 02, "suman");
         Employee e3 = new Employee(20000, 03, "suman");
        Employee e4 = new Employee(20000, 04, "suman");

        List<Employee> l = new ArrayList<>();
        l.add(e1);l.add(e2);l.add(e3);l.add(e4);l.add(e5);l.add(e6);
        System.out.println(l);
        System.out.println("after the sorting ==================");
        Collections.sort(l);
        System.out.println(l);

    }
}
