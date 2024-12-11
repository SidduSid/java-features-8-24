/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.streams;

import java.util.Arrays;
import java.util.List;

public class AnyMatchStreamExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Amit", "Deepa", "Rahul", "Suresh");
    // Check if any name starts with 'D'
    boolean anyMatch = names.stream().anyMatch(name -> name.startsWith("D"));
    System.out.println("Any name starts with D " + anyMatch);
  }
}
