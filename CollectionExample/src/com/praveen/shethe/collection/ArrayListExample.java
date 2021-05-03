package com.praveen.shethe.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Created by Praveenkumar on 5/3/2021.
 */
public class ArrayListExample {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mbhi", "Aoala" ,"Zakir", 22, 230231));
        employees.add(new Employee("Lbhi", "Poala" ,"Wakir", 22, 2305678));
        employees.add(new Employee("Kbhi", "Ooala" ,"Rakir", 22, 230098));
        employees.add(new Employee("Jbhi", "Ioala" ,"Qakir", 22, 230009));
        employees.add(new Employee("Ibhi", "Uoala" ,"Fakir", 22, 230062));
        employees.add(new Employee("Hbhi", "Yoala" ,"Aakir", 22, 230089));
        employees.add(new Employee("Gbhi", "Toala" ,"ZXakir", 22, 230001));
        employees.add(new Employee("Fbhi", "Roala" ,"Vakir", 22, 230087));
        employees.add(new Employee("Eabhi", "Eoala" ,"Bakir", 22, 230076));
        employees.add(new Employee("Dbhi", "Foala" ,"Bakir", 22, 230092));
        employees.add(new Employee("Cbhi", "Doala" ,"Nakir", 22, 230082));
        employees.add(new Employee("bbhi", "Xoala" ,"Wakir", 22, 230083));
        employees.add(new Employee("Abhi", "Zoala" ,"Uakir", 22, 230077));

        System.out.println("============================== UNSORTED LIST ======================================");
        System.out.println(employees);
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        });
        System.out.println("============================== (Name)SORTED LIST ======================================");
        System.out.println(employees);
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getLastName().compareTo(employee2.getLastName());
            }
        });
        System.out.println("============================== (MiddleName)SORTED LIST ======================================");
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getMiddleName().compareTo(employee2.getMiddleName());
            }
        });
        System.out.println(employees);
        System.out.println("============================== (LastName)SORTED LIST ======================================");
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getLastName().compareTo(employee2.getLastName());
            }
        });
        System.out.println(employees);
        System.out.println("============================== (Name)SORTED LIST using lambda expression ======================================");
        Collections.sort(employees, (employee1, employee2) -> {
            return employee1.getName().compareTo(employee2.getName());
        });
        System.out.println(employees);
    }
}

class Employee {

    Employee(String name, String middleName, String lastName, int age, int salary){
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    private String name, middleName, lastName;

    private int age, salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return age == employee.age && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, middleName, lastName, age, salary);
    }
}