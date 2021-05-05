package com.praveen.shethe.simplejava;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Praveenkumar on 5/6/2021.
 */
public class TestingImmutability {

    public static void main(String[] args) {

        Map<Person, Integer> map = new HashMap();

        PersonImmutable personImmutable = new PersonImmutable("praveenkumar", 37, "3421");

        Person person = new Person(personImmutable, 37);

        PersonImmutable personImmutable1 = new PersonImmutable("praveenkumar", 37, "3421");

        Person person1 = new Person(personImmutable, 37);

        map.put(person, 123);

        map.put(person1, 234);

        System.out.println(map);


    }
}
