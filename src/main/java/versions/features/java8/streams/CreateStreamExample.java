/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Amit", "Deepa", "Rahul", "Suresh");
    Stream<String> stream = names.stream();
    stream.forEach(System.out::println);
  }
}
