/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterStreamExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Amit", "Deepa", "Abi", "Suresh");
    Stream<String> stream = names.stream();

    // Filter names that start with 'A'
    names.stream()
          .filter(name -> name.startsWith("A"))
          .forEach(System.out::println);
  }
}
