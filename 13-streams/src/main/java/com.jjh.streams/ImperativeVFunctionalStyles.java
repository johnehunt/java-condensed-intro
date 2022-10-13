package com.jjh.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVFunctionalStyles {
    public static void main(String [] args) {

        List<Person> people = Arrays.asList(
                new Person("John", 56),
                new Person("Denise", 21),
                new Person("Jasmine", 20),
                new Person("Adam", 21)
        );

        System.out.println(people);

        // Procedural Style
        int count = 0;
        List<String> names1 = new ArrayList<>();
        for (Person p : people) {
            if (p.getAge() > 18) {
                String name = p.getName();
                names1.add(name);
            }
            count++;
            if (count == 10000) {
                break;
            }
        }

        // Functional Style
        List<String> names2 =
                people.stream()
                        .limit(10000)
                        .filter(p -> p.getAge() > 18)
                        .map(p -> p.getName())
                        .collect(Collectors.toList());
    }
}
