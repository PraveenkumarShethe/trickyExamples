package com.praveen.shethe.simplejava;

/**
 * Created by Praveenkumar on 5/6/2021.
 */
public class TestingImmutability {

    public static void main(String[] args) {

        PersonImmutable personImmutable = new PersonImmutable("praveenkumar", 37, "3421");

        Person person = new Person(personImmutable, 37);


    }
}
