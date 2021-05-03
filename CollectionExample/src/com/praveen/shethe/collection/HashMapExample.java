package com.praveen.shethe.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Praveenkumar on 5/3/2021.
 */
public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer, Student> studentHashMap = new HashMap<>();
        studentHashMap.put(121, new Student("Hello", "Hello", "Hello", 7, 1));
        studentHashMap.put(122, new Student("Hello", "Hello", "Hello", 7, 1));
        studentHashMap.put(123, new Student("Hello", "Hello", "Hello", 7, 1));
        studentHashMap.put(122, new Student("Hello", "Hello", "Hello", 7, 1));
        studentHashMap.put(123, new Student("Hello", "Hello", "Hello", 7, 1));
        studentHashMap.put(121, new Student("Hello", "Hello", "Hello", 7, 1));
        System.out.println(studentHashMap);
        System.out.println(studentHashMap.size());

    }
}


class Student {

    Student(String name, String middleName, String lastName, int age, int rollNo){
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.salary = rollNo;
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
        return "Student{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age && salary == student.salary && Objects.equals(name, student.name) && Objects.equals(middleName, student.middleName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, middleName, lastName, age, salary);
    }
*/
}
