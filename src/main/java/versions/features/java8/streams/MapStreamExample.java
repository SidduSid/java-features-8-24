/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapStreamExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Amit", "Deepa", "Abi", "Suresh");

     // Convert all names to uppercase
     names.stream()
           .map(name -> name.toUpperCase())
           .forEach(System.out::println);
   }
}
