/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.lamdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparatorExample {
  public static void main(String[] args) {

    // Without lambda expression.
    // Sort list by age
    Comparator<Person> withoutLambda =
        new Comparator<Person>() {
          @Override
          public int compare(Person o1, Person o2) {
            return o1.getAge() - o2.getAge();
          }
        };
    List<Person> listOfPerson = getPersons();
    listOfPerson.sort(withoutLambda);

    System.out.println(" sort persons by age in ascending order");
    for (Person person : listOfPerson) {
      System.out.println(" Person name : " + person.getName());
    }

    // With lambda expression.
    // Sort list by age
    List<Person> listOfPerson1 = getPersons1();
    Comparator<Person> withLambda = (o1, o2) -> o2.getAge() - o1.getAge();
    listOfPerson1.sort(withLambda);
    System.out.println(" sort persons by age in desending order");
    for (Person person : listOfPerson1) {
      System.out.println(" Person name : " + person.getName());
    }
  }

  static List<Person> getPersons() {
    List<Person> listOfPerson = new ArrayList<>();
    listOfPerson.add(new Person("abc", 27));
    listOfPerson.add(new Person("mno", 26));
    listOfPerson.add(new Person("pqr", 28));
    listOfPerson.add(new Person("xyz", 27));
    return listOfPerson;
  }

   static List<Person> getPersons1() {
    List<Person> listOfPerson = new ArrayList<>();
      listOfPerson.add(new Person("abc", 22));
      listOfPerson.add(new Person("mno", 26));
      listOfPerson.add(new Person("pqr", 28));
      listOfPerson.add(new Person("xyz", 27));
      return listOfPerson;
   }
}
