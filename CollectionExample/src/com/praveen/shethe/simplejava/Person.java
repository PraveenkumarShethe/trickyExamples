package com.praveen.shethe.simplejava;

import java.util.Objects;

/**
 * Created by Praveenkumar on 5/6/2021.
 */
public class Person {

    final PersonImmutable personImmutable;

    final int age;


    public Person(PersonImmutable personImmutable, int age) {
        this.personImmutable = personImmutable;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person that = (Person) o;
        return age == that.age && Objects.equals(personImmutable, that.personImmutable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personImmutable, age);
    }

    @Override
    public String toString() {
        return "TestPersonImmutable{" +
                "personImmutable=" + personImmutable +
                ", age=" + age +
                '}';
    }

    public PersonImmutable getPersonImmutable() {
        return personImmutable;
    }

    public int getAge() {
        return age;
    }
}
