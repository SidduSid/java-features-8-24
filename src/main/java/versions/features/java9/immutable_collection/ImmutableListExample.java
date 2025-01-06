/*
 * Copyright (c) 2025.  All rights are reserved
 */

package versions.features.java9.immutable_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListExample {
  public static void main(String[] args) {

    //before Java list.of() java9
    // Creating an ArrayList of String using
    List<String> fruits = new ArrayList<>();
    // Adding new elements to the ArrayList
    fruits.add("Banana");
    fruits.add("Apple");
    fruits.add("mango");
    fruits.add("orange");

    fruits = Collections.unmodifiableList(fruits);

    // Creating Immutable List
    //fruits.add("Strawberry"); // Exception in thread "main"
    // java.lang.UnsupportedOperationException<String> fruits = List.of("Banana", "Apple", "Mango",
    // "Orange");

    fruits.forEach(s -> System.out.println(s));



    // Creating Immutable List using java 9 list.of()
    List < String > fruits1 = List.of("Banana", "Apple", "Mango", "Orange");

    fruits1.forEach(e -> System.out.println(e));
    fruits1.add("Strawberry");

  }
}
