package com.praveen.shethe.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Praveenkumar on 5/5/2021.
 */
public class HashMapEmp {

    public static void main(String[] args) {

        Map<Emp, Integer> map = new HashMap();
        Emp emp = new Emp("Praveenkumar", 23);
        map.put(emp, 20000);
        Emp emp1 = new Emp("Praveenkumar", 23);
        map.put(emp1, 55000);

        System.out.println(map);

    }
}

class Emp{

    String name;

    int id;

    Emp(String name, int id){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emp)) return false;
        Emp emp = (Emp) o;
        return id == emp.id && Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}