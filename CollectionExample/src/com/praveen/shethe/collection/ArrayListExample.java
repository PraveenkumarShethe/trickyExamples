package com.praveen.shethe.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Praveenkumar on 5/3/2021.
 */
public class ArrayListExample {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Abhi", "Koala" ,"Zakir", 22, 230000));
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
}