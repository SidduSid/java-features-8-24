/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectStreamExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Amit", "Deepa", "Rahul", "Suresh", "Daya");

    // Collect names that start with 'D' into a List
    List<String> startsWithD =
        names.stream().filter(s -> s.startsWith("D"))
              .collect(Collectors.toList());
    startsWithD.forEach(System.out::println);
  }
}
