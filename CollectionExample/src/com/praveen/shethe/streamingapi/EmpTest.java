package com.praveen.shethe.streamingapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Praveenkumar on 5/10/2021.
 */
public class EmpTest {

    public static void main(String[] args) {

        List employeeList = new ArrayList<>();
        employeeList.add(new Employee("Abc", 23, 209999));
        employeeList.add(new Employee("Ghc", 23, 430000));
        employeeList.add(new Employee("pkaj", 24, 562890));
        System.out.println(employeeList);
        List sortedEmpList = (List) employeeList.stream().sorted((emp1, emp2) -> emp1.getClass()).collect(Collectors.toList());
        System.out.println(sortedEmpList);
    }
}
