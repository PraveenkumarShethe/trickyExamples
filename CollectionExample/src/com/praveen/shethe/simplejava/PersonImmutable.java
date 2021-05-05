package com.praveen.shethe.simplejava;

import java.util.Objects;

/**
 * Created by Praveenkumar on 5/6/2021.
 */
public final class PersonImmutable {

    private final String name;

    private final int age;

    private final String id;


    public PersonImmutable(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonImmutable)) return false;
        PersonImmutable that = (PersonImmutable) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PersonImmutable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }


}
