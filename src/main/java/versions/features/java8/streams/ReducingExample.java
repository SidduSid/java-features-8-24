/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.streams;

import versions.features.java8.lamdas.Person;

import java.util.ArrayList;
import java.util.List;

public class ReducingExample {
   public static void main(String[] args) {
      // Create a list of Person objects
      List<Person> people = new ArrayList<>();
      people.add(new Person("Ravi", 25));
      people.add(new Person("Sita", 30));
      people.add(new Person("Arjun", 22));
      people.add(new Person("Lakshmi", 20));
      people.add(new Person("Rahul", 25));

      //Reducing is a terminal operation that combines elements of
      // a stream into a single result. Let's find the sum of the ages
      // of all people.
      int totalAge = people.stream()
            .map(Person::getAge)
            .reduce(0, Integer::sum);

      System.out.println("Total Age: " + totalAge);
   }
}
