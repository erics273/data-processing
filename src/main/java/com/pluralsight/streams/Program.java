package com.pluralsight.streams;

import com.pluralsight.Person;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("John", "Smith", 25),
                new Person("Sarah", "Johnson", 32),
                new Person("Michael", "Williams", 18),
                new Person("Emily", "Brown", 45),
                new Person("David", "Jones", 29),
                new Person("Jessica", "Garcia", 21),
                new Person("James", "Miller", 55),
                new Person("Ashley", "Davis", 37),
                new Person("Robert", "Wilson", 16),
                new Person("Amanda", "Taylor", 42)
        ));

        Collections.sort(people);

//        for (Person person : people) {
//            System.out.println(person.getLastName());
//        }

        people.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .forEach(person -> System.out.println(person.getAge()));



    }

}
